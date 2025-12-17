package com.codecomet.projects.lovable_clone.controller;

import com.codecomet.projects.lovable_clone.dto.subscription.*;
import com.codecomet.projects.lovable_clone.service.PlanService;
import com.codecomet.projects.lovable_clone.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillingController {

    private final SubscriptionService subscriptionService;
    private final PlanService planService;

    @GetMapping("/api.plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans(){
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription(){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.getCurrentSubscription(userId));
    }

    @PostMapping("/api/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(@RequestBody CheckoutRequest checkoutRequest){
        Long userId = 1L;

        return ResponseEntity.ok(subscriptionService.createCheckoutSessionUrl(checkoutRequest,userId));
    }

    @PostMapping("/api/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal(){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(userId));
    }
}
