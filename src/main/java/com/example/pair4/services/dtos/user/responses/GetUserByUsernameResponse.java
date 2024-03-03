package com.example.pair4.services.dtos.user.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserByUsernameResponse {

    private String username;
    private int id;
}
