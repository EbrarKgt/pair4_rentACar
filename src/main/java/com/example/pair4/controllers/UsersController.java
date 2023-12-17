package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.UserService;
import com.example.pair4.services.dtos.user.requests.AddUserRequest;
import com.example.pair4.services.dtos.user.requests.DeleteUserRequest;
import com.example.pair4.services.dtos.user.requests.UpdateUserRequest;
import com.example.pair4.services.dtos.user.responses.GetAllUserResponse;
import com.example.pair4.services.dtos.user.responses.GetByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UsersController {
    private UserService userService;

    @GetMapping("get-all-users")
    private List<GetAllUserResponse> getAll() {
        return userService.getAll();
    }

    @GetMapping("{id}")
    private GetByIdResponse getByIdResponse(@PathVariable int id){
        return userService.getByIdResponse(id);
    }

    @PostMapping
    private void addUserRequest (@RequestBody @Valid AddUserRequest addUserRequest){
        userService.addUser(addUserRequest);
    }

    @PutMapping
    private void updateUserRequest (@RequestBody @Valid UpdateUserRequest updateUserRequest){
        userService.updateUser(updateUserRequest);
    }

    @DeleteMapping
    private void deleteUserRequest (@RequestBody @Valid DeleteUserRequest deleteUserRequest) {
        userService.deleteUser(deleteUserRequest);
    }
}