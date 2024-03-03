package com.example.pair4.services.abstracts;

import com.example.pair4.services.dtos.user.requests.CreateUserRequest;
import com.example.pair4.services.dtos.user.requests.LoginRequest;
import com.example.pair4.services.dtos.user.responses.AuthResponse;

public interface AuthService {
    void register(CreateUserRequest createUserRequest);
    AuthResponse login(LoginRequest loginRequest);
}
