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
            AND p.owner.id = :userId
            ORDER BY p.updatedAt DESC
            """)
    List<Project> findAllAccessibleByUser(@Param("userId") Long userId);

    @Query("""
            select p from Project p
            LEFT JOIN FETCH p.owner
            where p.id = :id
            AND p.deletedAt is NULL
            AND p.owner.id = :userId
            """)
    Optional<Project> findAccessibleProjectById(@Param("id" ) Long id, @Param("userId") Long userId);
}
