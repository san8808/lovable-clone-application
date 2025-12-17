package com.codecomet.projects.lovable_clone.entity;

import com.codecomet.projects.lovable_clone.entity.enums.SubscriptionStatus;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Table(name = "subscriptions")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    Long id;
    User user ;
    Plan plan;
    String stripeCustomerId;
    String stripeSubscriptionId;
    SubscriptionStatus status;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    boolean cancelAtPeriodEnd;

    Instant createdAt;
    Instant updatedAt;

}
