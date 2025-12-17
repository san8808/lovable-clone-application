package com.codecomet.projects.lovable_clone.dto.subscription;

public record UsageTodayResponse(
        int tokenUsed,
        int tokenLimit,
        int previewsRunning,
        int previewsLimit
) {

}
