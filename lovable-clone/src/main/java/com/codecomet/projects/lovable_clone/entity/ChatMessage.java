package com.codecomet.projects.lovable_clone.entity;

import com.codecomet.projects.lovable_clone.entity.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;

    Project project;

    User user;

    ChatSession chatSession;

    String content;

    MessageRole messageRole;

    String toolCalls;// JSON Array of tools called

    Integer tokensUsed;
    Instant createdAt;



}
