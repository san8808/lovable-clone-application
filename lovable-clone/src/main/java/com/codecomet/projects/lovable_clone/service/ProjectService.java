package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.project.ProjectRequest;
import com.codecomet.projects.lovable_clone.dto.project.ProjectResponse;
import com.codecomet.projects.lovable_clone.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
     List<ProjectSummaryResponse> getUserProjects(Long userId);

     ProjectResponse getUserProjectById(Long id);

     ProjectResponse createProject(ProjectRequest request, Long userId);

     ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
