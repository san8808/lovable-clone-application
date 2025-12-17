package com.codecomet.projects.lovable_clone.entity;

import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Table(name = "plan")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id;
    String name;
    String stripePriceId;
    Integer maxProjects;
    Integer maxTokensPerDay;
    Integer maxPreviews;
    Boolean unlimitedAi; //unlimitedAccess to LLM, ignore maxTokensPerDay if true

    Boolean active;

}
