package com.example.pair4.services.dtos.user.requests;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequest {

    @Positive(message = "Enter a value greater than 0.")
    private int id;
    private String name;
    private String surname;
    private LocalDate birthDate;
}

