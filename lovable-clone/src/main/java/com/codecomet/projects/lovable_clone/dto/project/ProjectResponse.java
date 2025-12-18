package com.codecomet.projects.lovable_clone.dto.project;

import com.codecomet.projects.lovable_clone.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
