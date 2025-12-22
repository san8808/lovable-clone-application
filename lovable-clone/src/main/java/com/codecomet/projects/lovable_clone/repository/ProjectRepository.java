package com.codecomet.projects.lovable_clone.repository;

import com.codecomet.projects.lovable_clone.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("""
            select p from Project p
            WHERE p.deletedAt IS NULL
            AND EXISTS(
                SELECT 1 FROM ProjectMember pm
                WHERE pm.id.userId = :userId
                AND pm.id.projectId = p.id
            )
            ORDER BY p.updatedAt DESC
            """)
    List<Project> findAllAccessibleByUser(@Param("userId") Long userId);

    @Query("""
            select p from Project p
            where p.id = :id
               AND p.deletedAt is NULL
               AND EXISTS(
                SELECT 1 FROM ProjectMember pm
                WHERE pm.id.userId = :userId
                AND pm.id.projectId = :id
            )
            """)
    Optional<Project> findAccessibleProjectById(@Param("id" ) Long id, @Param("userId") Long userId);
}
