package com.example.pair4.services.dtos.rent.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllRentResponse {

    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate returnDate;
    private int startKilometer;
    private int endKilometer;
    private double totalPrice;
    private int carId;


    // TODO: carId yerine plaka,modelName gibi bir kaç özelliği döndüren bir dto yazılacak.


}
