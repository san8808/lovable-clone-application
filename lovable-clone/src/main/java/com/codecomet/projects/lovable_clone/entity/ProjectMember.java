package com.codecomet.projects.lovable_clone.entity;

import com.codecomet.projects.lovable_clone.entity.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {

    ProjectMemberId id;

    Project project;
    User user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;

}
