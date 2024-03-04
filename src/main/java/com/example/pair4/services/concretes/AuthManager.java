package com.example.pair4.services.concretes;

import com.example.pair4.core.services.JwtService;
import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.User;
import com.example.pair4.services.abstracts.AuthService;
import com.example.pair4.services.abstracts.UserService;
import com.example.pair4.services.dtos.user.requests.CreateUserRequest;
import com.example.pair4.services.dtos.user.requests.LoginRequest;
import com.example.pair4.services.dtos.user.responses.AuthResponse;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@AllArgsConstructor
public class AuthManager implements AuthService {

    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;
    private ModelMapperService modelMapperService;

    @Override
    public void register(CreateUserRequest createUserRequest) {
        User user = this.modelMapperService.forRequest().map(createUserRequest, User.class);
        user.setPassword(passwordEncoder.encode(createUserRequest.getPassword()));
        user.setAuthorities(createUserRequest.getRoles());
        userService.add(user);
    }

    @Override
    public AuthResponse login(LoginRequest loginRequest) {

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        if (authentication.isAuthenticated()){
            User user = userService.getUserByUsernameResponse(loginRequest.getUsername());
            AuthResponse authResponse = new AuthResponse();
            authResponse.setMessage(jwtService.generateToken(loginRequest.getUsername()));
            authResponse.setUserId(user.getId());
            return authResponse;
        }
        throw  new RuntimeException("Username or Password is wrong!");
        }
}
