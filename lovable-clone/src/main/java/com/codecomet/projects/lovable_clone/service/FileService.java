package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.project.FileContentResponse;
import com.codecomet.projects.lovable_clone.dto.project.FileNode;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FileService {
     List<FileNode> getFileTree(Long projectId, Long userId);

     FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
