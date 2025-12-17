package com.codecomet.projects.lovable_clone.controller;

import com.codecomet.projects.lovable_clone.dto.project.FileContentResponse;
import com.codecomet.projects.lovable_clone.dto.project.FileNode;
import com.codecomet.projects.lovable_clone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectId}/files")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileTree(projectId,userId));
    }

    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getFile(@PathVariable Long projectId, @PathVariable String path){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileContent(projectId,path,userId));

    }


}
