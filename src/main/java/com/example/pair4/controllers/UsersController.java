package com.example.pair4.controllers;

import com.example.pair4.core.services.JwtService;
import com.example.pair4.entities.User;
import com.example.pair4.services.abstracts.UserService;
import com.example.pair4.services.dtos.user.requests.CreateUserRequest;
import com.example.pair4.services.dtos.user.requests.DeleteUserRequest;
import com.example.pair4.services.dtos.user.requests.LoginRequest;
import com.example.pair4.services.dtos.user.requests.UpdateUserRequest;
import com.example.pair4.services.dtos.user.responses.GetAllUserResponse;
import com.example.pair4.services.dtos.user.responses.GetUserByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
@CrossOrigin
public class UsersController {
    private UserService userService;

    @PostMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    private void add(@RequestBody @Valid User createUserRequest) {
        userService.add(createUserRequest);
    }

    @PutMapping
    private void update(@RequestBody @Valid UpdateUserRequest updateUserRequest) {
        userService.update(updateUserRequest);
    }

    @DeleteMapping
    private void delete(@RequestBody @Valid DeleteUserRequest deleteUserRequest) {
        userService.delete(deleteUserRequest);
    }
    @GetMapping("get-all-users")
    private List<GetAllUserResponse> getAll() {
        return userService.getAll();
    }

    @GetMapping("/get/{id}")
    private GetUserByIdResponse getByIdResponse(@PathVariable int id) {
        return userService.getUserByIdResponse(id);
    }

}