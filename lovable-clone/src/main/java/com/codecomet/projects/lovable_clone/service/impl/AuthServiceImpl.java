package com.codecomet.projects.lovable_clone.service.impl;

import com.codecomet.projects.lovable_clone.dto.auth.AuthResponse;
import com.codecomet.projects.lovable_clone.dto.auth.LoginRequest;
import com.codecomet.projects.lovable_clone.dto.auth.SignupRequest;
import com.codecomet.projects.lovable_clone.entity.User;
import com.codecomet.projects.lovable_clone.error.BadRequestException;
import com.codecomet.projects.lovable_clone.error.ResourceNotFoundException;
import com.codecomet.projects.lovable_clone.mapper.UserMapper;
import com.codecomet.projects.lovable_clone.repository.UserRepository;
import com.codecomet.projects.lovable_clone.security.AuthUtil;
import com.codecomet.projects.lovable_clone.service.AuthService;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthServiceImpl implements AuthService {

    UserRepository userRepository;
    UserMapper userMapper;
    PasswordEncoder passwordEncoder;
    AuthUtil authUtil;
    AuthenticationManager authenticationManager;

    @Override
    public AuthResponse signup(SignupRequest signupRequest) {

        userRepository.findByUsername(signupRequest.username())
                .ifPresent(user -> {
                    throw new BadRequestException("User already exists with username " + signupRequest.username());
                });

        User user = userMapper.toEntity(signupRequest);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        String token = authUtil.generateAccessToken(user);

        return new AuthResponse(token,userMapper.toUserProfileResponse(user));
    }

    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.username(), loginRequest.password())
            );
            User user =  (User) authentication.getPrincipal();

            String token = authUtil.generateAccessToken(user);

            return new AuthResponse(token,userMapper.toUserProfileResponse(user));
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
