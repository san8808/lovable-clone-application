package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
     UsageTodayResponse getTodayUsage(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(long userId);
}
