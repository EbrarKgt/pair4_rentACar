package com.example.pair4.services.dtos.rent.requests;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddRentRequest {

    @FutureOrPresent(message = "start date must be future or present.")
    private LocalDate startDate;

    @FutureOrPresent(message = "end date must be future or present.")
    private LocalDate endDate;

    @Positive(message = "Enter a value greater than 0.")
    private int carId;

    @Positive(message = "Enter a value greater than 0.")
    private int userId;

}
