package com.codecomet.projects.lovable_clone.controller;

import com.codecomet.projects.lovable_clone.dto.auth.AuthResponse;
import com.codecomet.projects.lovable_clone.dto.auth.LoginRequest;
import com.codecomet.projects.lovable_clone.dto.auth.SignupRequest;
import com.codecomet.projects.lovable_clone.dto.auth.UserProfileResponse;
import com.codecomet.projects.lovable_clone.service.AuthService;
import com.codecomet.projects.lovable_clone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private AuthService authService;
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest signupRequest){
        return ResponseEntity.ok(authService.signup(signupRequest));

    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/myProfile")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));

    }
}
