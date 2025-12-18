package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
     UserProfileResponse getProfile(Long userId);
}
