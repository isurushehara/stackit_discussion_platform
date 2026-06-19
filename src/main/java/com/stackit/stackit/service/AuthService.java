package com.stackit.stackit.service;

import com.stackit.stackit.dto.request.LoginRequest;
import com.stackit.stackit.dto.request.RegisterRequest;
import com.stackit.stackit.dto.response.AuthResponse;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);

}