package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
