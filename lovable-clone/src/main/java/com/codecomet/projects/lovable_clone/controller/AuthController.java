package com.codecomet.projects.lovable_clone.controller;

import com.codecomet.projects.lovable_clone.dto.auth.AuthResponse;
import com.codecomet.projects.lovable_clone.dto.auth.LoginRequest;
import com.codecomet.projects.lovable_clone.dto.auth.SignupRequest;
import com.codecomet.projects.lovable_clone.dto.auth.UserProfileResponse;
import com.codecomet.projects.lovable_clone.service.AuthService;
import com.codecomet.projects.lovable_clone.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthController {

    private AuthService authService;
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest signupRequest){
        return ResponseEntity.ok(authService.signup(signupRequest));

    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/myProfile")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));

    }
}
