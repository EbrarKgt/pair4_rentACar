package com.example.pair4.services.dtos.user.requests;

import com.example.pair4.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {

    private String email;
    private String username;
    private String password;
    private List<Role> roles;
}
