package com.codecomet.projects.lovable_clone.service;

import com.codecomet.projects.lovable_clone.dto.auth.AuthResponse;
import com.codecomet.projects.lovable_clone.dto.auth.LoginRequest;
import com.codecomet.projects.lovable_clone.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {

     AuthResponse signup(SignupRequest signupRequest);

     AuthResponse login(LoginRequest loginRequest);
}
