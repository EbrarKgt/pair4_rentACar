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
public class UpdateRentRequest {

    @Positive(message = "Enter a value greater than 0.")
    private int id;

    @FutureOrPresent(message = "start date must be future or present.")
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate returnDate;
    private int startKilometer;
    private int endKilometer;
    private int carId;
    private int userId;
}
