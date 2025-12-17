package com.codecomet.projects.lovable_clone.dto.subscription;


public record PlanLimitResponse(
        String planName,
        int maxTokensPerDay,
        int maxProjects,
        boolean unlimitedAi
) {
}
