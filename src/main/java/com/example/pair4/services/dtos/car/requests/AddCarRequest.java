package com.example.pair4.services.dtos.car.requests;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCarRequest {

    private String plate;
    private int kilometer;
    private double dailyPrice;
    private int year;
    private int modelId;
    private int colorId;

}
