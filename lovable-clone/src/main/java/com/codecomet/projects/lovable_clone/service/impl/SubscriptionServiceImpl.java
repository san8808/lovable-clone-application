package com.codecomet.projects.lovable_clone.service.impl;

import com.codecomet.projects.lovable_clone.dto.subscription.CheckoutRequest;
import com.codecomet.projects.lovable_clone.dto.subscription.CheckoutResponse;
import com.codecomet.projects.lovable_clone.dto.subscription.PortalResponse;
import com.codecomet.projects.lovable_clone.dto.subscription.SubscriptionResponse;
import com.codecomet.projects.lovable_clone.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest checkoutRequest, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
