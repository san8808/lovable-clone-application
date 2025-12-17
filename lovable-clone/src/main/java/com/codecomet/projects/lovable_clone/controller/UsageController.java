package com.codecomet.projects.lovable_clone.controller;


import com.codecomet.projects.lovable_clone.dto.subscription.PlanLimitResponse;
import com.codecomet.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import com.codecomet.projects.lovable_clone.service.UsageService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usage")
@RequiredArgsConstructor
public class UsageController {

    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getTodayUsage(userId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getPlanLimits(){
        long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfUser(userId));
    }
}
