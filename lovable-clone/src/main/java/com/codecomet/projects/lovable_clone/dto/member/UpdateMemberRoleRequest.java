package com.codecomet.projects.lovable_clone.dto.member;

import com.codecomet.projects.lovable_clone.entity.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role
) {
}
