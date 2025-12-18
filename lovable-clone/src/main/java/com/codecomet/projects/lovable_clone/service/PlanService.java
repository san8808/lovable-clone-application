package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
