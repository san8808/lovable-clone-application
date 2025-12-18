package com.codecomet.projects.lovable_clone.dto.subscription;


public record PlanLimitResponse(
        String planName,
        Integer maxTokensPerDay,
        Integer maxProjects,
        boolean unlimitedAi
) {
}
