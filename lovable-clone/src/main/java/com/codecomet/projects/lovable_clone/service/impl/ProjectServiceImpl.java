package com.codecomet.projects.lovable_clone.service.impl;

import com.codecomet.projects.lovable_clone.dto.project.ProjectRequest;
import com.codecomet.projects.lovable_clone.dto.project.ProjectResponse;
import com.codecomet.projects.lovable_clone.dto.project.ProjectSummaryResponse;
import com.codecomet.projects.lovable_clone.entity.Project;
import com.codecomet.projects.lovable_clone.entity.User;
import com.codecomet.projects.lovable_clone.mapper.ProjectMapper;
import com.codecomet.projects.lovable_clone.repository.ProjectRepository;
import com.codecomet.projects.lovable_clone.repository.UserRepository;
import com.codecomet.projects.lovable_clone.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

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


    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {

//        return projectRepository.findAllAccessibleByUser(userId)
//                .stream()
//                .map(projectMapper::toProjectSummaryResponse)
//                .collect(Collectors.toList());

        return projectMapper.toListProjectSummaryResponse(projectRepository.findAllAccessibleByUser(userId));
    }

    @Override
    public ProjectResponse getUserProjectById(Long id) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {

        User owner = userRepository.findById(userId).orElseThrow();

        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .build();

        project = projectRepository.save(project);

        return projectMapper.toProjectResponse(project);
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
