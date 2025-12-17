package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.subscription.CheckoutRequest;
import com.codecomet.projects.lovable_clone.dto.subscription.CheckoutResponse;
import com.codecomet.projects.lovable_clone.dto.subscription.PortalResponse;
import com.codecomet.projects.lovable_clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

     CheckoutResponse createCheckoutSessionUrl(CheckoutRequest checkoutRequest, Long userId);

     PortalResponse openCustomerPortal(Long userId);
}
