package com.example.pair4.services.dtos.user.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserByIdResponse {

    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
}
