package com.example.pair4.services.dtos.rental.responses;

import com.example.pair4.services.dtos.car.responses.GetCarByIdResponse;
import com.example.pair4.services.dtos.user.responses.GetUserByIdResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllRentalResponse {

    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate returnDate;
    private int startKilometer;
    private int endKilometer;
    private double totalPrice;
    private GetCarByIdResponse getCarByIdResponse;
    private GetUserByIdResponse getUserByIdResponse;


    // TODO: carId yerine plaka,modelName gibi bir kaç özelliği döndüren bir dto yazılacak.


}
