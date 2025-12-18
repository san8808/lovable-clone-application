package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.subscription.PlanLimitResponse;
import com.codecomet.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public interface UsageService {
     UsageTodayResponse getTodayUsage(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(long userId);
}
