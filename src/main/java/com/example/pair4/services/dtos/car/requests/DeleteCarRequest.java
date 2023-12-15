package com.example.pair4.services.dtos.car.requests;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteCarRequest {
    @Positive(message = "Enter a value greater than 0.")
    private int id;

}
