package com.example.pair4.services.abstracts;

import com.example.pair4.entities.User;
import com.example.pair4.services.dtos.user.requests.CreateUserRequest;
import com.example.pair4.services.dtos.user.requests.DeleteUserRequest;
import com.example.pair4.services.dtos.user.requests.LoginRequest;
import com.example.pair4.services.dtos.user.requests.UpdateUserRequest;
import com.example.pair4.services.dtos.user.responses.GetAllUserResponse;
import com.example.pair4.services.dtos.user.responses.GetUserByIdResponse;
import com.example.pair4.services.dtos.user.responses.GetUserByUsernameResponse;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    void add(User user);
    void update(UpdateUserRequest updateUserRequest);
    void delete(DeleteUserRequest deleteUserRequest);
    List<GetAllUserResponse> getAll();
    GetUserByIdResponse getUserByIdResponse(int id);
    User getUserByUsernameResponse(String username);
    User getById(int id);
}
