package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.AuthService;
import com.example.pair4.services.dtos.user.requests.CreateUserRequest;
import com.example.pair4.services.dtos.user.requests.LoginRequest;
import com.example.pair4.services.dtos.user.responses.AuthResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
@CrossOrigin
public class AuthController {

    private final AuthService authService;

    @PostMapping("login")
    @ResponseStatus(HttpStatus.OK)
    public AuthResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody CreateUserRequest request) {
        authService.register(request);
    }

}
