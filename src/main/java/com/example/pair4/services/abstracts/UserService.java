package com.example.pair4.services.abstracts;

import com.example.pair4.entities.User;
import com.example.pair4.services.dtos.user.requests.AddUserRequest;
import com.example.pair4.services.dtos.user.requests.DeleteUserRequest;
import com.example.pair4.services.dtos.user.requests.UpdateUserRequest;
import com.example.pair4.services.dtos.user.responses.GetAllUserResponse;
import com.example.pair4.services.dtos.user.responses.GetByIdResponse;

import java.util.List;

public interface UserService {
    List<GetAllUserResponse> getAll();

    GetByIdResponse getByIdResponse(int id);

    void add(AddUserRequest addUserRequest);

    void update(UpdateUserRequest updateUserRequest);

    void delete(DeleteUserRequest deleteUserRequest);

    User getById(int id);  //isimlendirilmesine bakılsın
}
