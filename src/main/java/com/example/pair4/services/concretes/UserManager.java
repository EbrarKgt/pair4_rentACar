package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.User;
import com.example.pair4.repositories.UserRepository;
import com.example.pair4.services.abstracts.UserService;
import com.example.pair4.services.dtos.user.requests.AddUserRequest;
import com.example.pair4.services.dtos.user.requests.DeleteUserRequest;
import com.example.pair4.services.dtos.user.requests.UpdateUserRequest;
import com.example.pair4.services.dtos.user.responses.GetAllUserResponse;
import com.example.pair4.services.dtos.user.responses.GetUserByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserManager implements UserService {
    private final UserRepository userRepository;
    private ModelMapperService modelMapperService;


    @Override
    public void add(AddUserRequest addUserRequest) {
        User user = this.modelMapperService.forRequest().map(addUserRequest, User.class);
        this.userRepository.save(user);
    }

    @Override
    public void update(UpdateUserRequest updateUserRequest) {
        User userToUpdate = this.modelMapperService.forRequest().map(updateUserRequest, User.class);
        this.userRepository.save(userToUpdate);
    }

    @Override
    public void delete(DeleteUserRequest deleteUserRequest) {
        User userToDelete = this.userRepository.findById(deleteUserRequest.getId()).orElseThrow();
        this.userRepository.delete(userToDelete);
    }

    @Override
    public List<GetAllUserResponse> getAll() {
        List<User> users = userRepository.findAll();
        List<GetAllUserResponse> userResponses = users.stream()
                .map(user -> this.modelMapperService.forResponse()
                        .map(user, GetAllUserResponse.class))
                .toList();
        return userResponses;
    }

    @Override
    public GetUserByIdResponse getUserByIdResponse(int id) {
        User user = this.userRepository.findById(id).orElseThrow();
        GetUserByIdResponse getUserByIdResponse = this.modelMapperService.forResponse().map(user, GetUserByIdResponse.class);
        return getUserByIdResponse;
    }

    @Override
    public User getById(int id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no user with this id!"));
    }
}
