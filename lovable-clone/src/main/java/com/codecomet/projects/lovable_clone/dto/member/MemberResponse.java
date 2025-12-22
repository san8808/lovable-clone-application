package com.codecomet.projects.lovable_clone.dto.member;

import com.codecomet.projects.lovable_clone.entity.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String username,
        String name,
        ProjectRole projectRole,
        Instant invitedAt
) {
}
