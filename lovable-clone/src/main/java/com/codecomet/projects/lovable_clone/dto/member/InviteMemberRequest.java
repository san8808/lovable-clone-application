package com.codecomet.projects.lovable_clone.dto.member;

import com.codecomet.projects.lovable_clone.entity.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
