package com.codecomet.projects.lovable_clone.entity;

import com.codecomet.projects.lovable_clone.entity.enums.ProjectRole;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "project_members")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectMember {

    @EmbeddedId
    ProjectMemberId id;

    @ManyToOne
    @MapsId("projectId")
    Project project;

    @ManyToOne
    @MapsId("userId")
    User user;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    ProjectRole projectRole;


    Instant invitedAt;

    Instant acceptedAt;

}
