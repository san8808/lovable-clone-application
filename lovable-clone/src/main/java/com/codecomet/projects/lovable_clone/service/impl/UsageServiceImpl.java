package com.codecomet.projects.lovable_clone.service.impl;

import com.codecomet.projects.lovable_clone.dto.subscription.PlanLimitResponse;
import com.codecomet.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import com.codecomet.projects.lovable_clone.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsage(Long userId) {
        return null;
    }

    @Override
    public PlanLimitResponse getCurrentSubscriptionLimitsOfUser(long userId) {
        return null;
    }
}
