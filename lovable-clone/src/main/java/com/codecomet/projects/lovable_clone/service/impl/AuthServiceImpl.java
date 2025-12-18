package com.codecomet.projects.lovable_clone.service.impl;

import com.codecomet.projects.lovable_clone.dto.auth.AuthResponse;
import com.codecomet.projects.lovable_clone.dto.auth.LoginRequest;
import com.codecomet.projects.lovable_clone.dto.auth.SignupRequest;
import com.codecomet.projects.lovable_clone.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest signupRequest) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        return null;
    }
}
