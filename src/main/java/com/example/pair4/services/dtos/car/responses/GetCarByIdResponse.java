package com.example.pair4.services.dtos.car.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCarByIdResponse {

    private String plate;
    private int kilometer;
    private double dailyPrice;
    private int year;
    private String modelName;
    private String colorName;

}
