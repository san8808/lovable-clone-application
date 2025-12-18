package com.codecomet.projects.lovable_clone.dto.subscription;

public record UsageTodayResponse(
        Integer tokenUsed,
        Integer tokenLimit,
        Integer previewsRunning,
        Integer previewsLimit
) {

}
