package com.codecomet.projects.lovable_clone.service.impl;

import ch.qos.logback.classic.spi.IThrowableProxy;
import com.codecomet.projects.lovable_clone.dto.project.ProjectRequest;
import com.codecomet.projects.lovable_clone.dto.project.ProjectResponse;
import com.codecomet.projects.lovable_clone.dto.project.ProjectSummaryResponse;
import com.codecomet.projects.lovable_clone.entity.Project;
import com.codecomet.projects.lovable_clone.entity.ProjectMember;
import com.codecomet.projects.lovable_clone.entity.ProjectMemberId;
import com.codecomet.projects.lovable_clone.entity.User;
import com.codecomet.projects.lovable_clone.entity.enums.ProjectRole;
import com.codecomet.projects.lovable_clone.error.ResourceNotFoundException;
import com.codecomet.projects.lovable_clone.mapper.ProjectMapper;
import com.codecomet.projects.lovable_clone.repository.ProjectMemberRepository;
import com.codecomet.projects.lovable_clone.repository.ProjectRepository;
import com.codecomet.projects.lovable_clone.repository.UserRepository;
import com.codecomet.projects.lovable_clone.security.AuthUtil;
import com.codecomet.projects.lovable_clone.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;
    ProjectMemberRepository projectMemberRepository;
    AuthUtil authUtil;


    @Override
    public List<ProjectSummaryResponse> getUserProjects() {

        Long userId = authUtil.getCurrentUserId();

//        return projectRepository.findAllAccessibleByUser(userId)
//                .stream()
//                .map(projectMapper::toProjectSummaryResponse)
//                .collect(Collectors.toList());

        return projectMapper.toListProjectSummaryResponse(projectRepository.findAllAccessibleByUser(userId));
    }

    @Override
    public ProjectResponse getUserProjectById(Long id) {
        Long userId = authUtil.getCurrentUserId();

        Project project = getAccessibleProject(id,userId);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request) {
        Long userId = authUtil.getCurrentUserId();
//        User owner = userRepository.findById(userId).orElseThrow();

        User owner = userRepository.getReferenceById(userId); // database call will not be made

        Project project = Project.builder()
                .name(request.name())
                .build();

        project = projectRepository.save(project);

        ProjectMemberId projectMemberId = new ProjectMemberId(project.getId(), userId);
        ProjectMember projectMember = ProjectMember.builder()
                .id(projectMemberId)
                .projectRole(ProjectRole.OWNER)
                .user(owner)
                .acceptedAt(Instant.now())
                .invitedAt(Instant.now())
                .project(project)
                .build();

        projectMemberRepository.save(projectMember);

        return projectMapper.toProjectResponse(project);
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request) {
        Long userId = authUtil.getCurrentUserId();
        Project project = getAccessibleProject(id,userId);

        project.setName(request.name());
        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public void softDelete(Long id) {
        Long userId = authUtil.getCurrentUserId();
        Project project = getAccessibleProject(id,userId);

        project.setDeletedAt(Instant.now());
        projectRepository.save(project);
    }

    public Project getAccessibleProject(Long projectId, Long userId){
        return projectRepository.findAccessibleProjectById(projectId,userId)
                .orElseThrow(() -> new ResourceNotFoundException("Project", projectId.toString()));
    }
}
