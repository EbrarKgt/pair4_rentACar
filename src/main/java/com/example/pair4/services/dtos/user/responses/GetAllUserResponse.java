package com.example.pair4.services.dtos.user.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUserResponse {
    private String name;
    private String surname;
    private String email;
    private LocalDateTime birthDate;
}