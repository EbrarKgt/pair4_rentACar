package com.example.pair4.services.abstracts;

import com.example.pair4.entities.User;
import com.example.pair4.services.dtos.user.requests.AddUserRequest;
import com.example.pair4.services.dtos.user.requests.DeleteUserRequest;
import com.example.pair4.services.dtos.user.requests.UpdateUserRequest;
import com.example.pair4.services.dtos.user.responses.GetAllUserResponse;
import com.example.pair4.services.dtos.user.responses.GetUserByIdResponse;

import java.util.List;

public interface UserService {
    void add(AddUserRequest addUserRequest);
    void update(UpdateUserRequest updateUserRequest);
    void delete(DeleteUserRequest deleteUserRequest);
    List<GetAllUserResponse> getAll();
    GetUserByIdResponse getUserByIdResponse(int id);
    User getById(int id);
}
