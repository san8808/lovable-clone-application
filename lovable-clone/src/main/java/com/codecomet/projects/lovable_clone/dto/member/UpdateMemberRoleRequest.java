package com.codecomet.projects.lovable_clone.dto.member;

import com.codecomet.projects.lovable_clone.entity.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole role
) {
}
