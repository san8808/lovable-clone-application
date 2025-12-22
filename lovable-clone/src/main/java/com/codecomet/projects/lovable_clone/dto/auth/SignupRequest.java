package com.codecomet.projects.lovable_clone.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SignupRequest(
       @NotBlank @Email String username,
       @NotBlank String name,
       @Size(min = 4 , max = 50) @NotBlank String password
) {
}
