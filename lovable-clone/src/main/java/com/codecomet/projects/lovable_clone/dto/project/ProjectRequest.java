package com.codecomet.projects.lovable_clone.dto.project;

import com.codecomet.projects.lovable_clone.dto.auth.UserProfileResponse;
import jakarta.validation.constraints.NotBlank;

import java.time.Instant;

public record ProjectRequest(
       @NotBlank String name
) {
}
