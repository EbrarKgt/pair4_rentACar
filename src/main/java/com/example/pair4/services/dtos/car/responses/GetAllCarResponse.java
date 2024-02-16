package com.example.pair4.services.dtos.car.responses;


import com.example.pair4.services.dtos.requirement.responses.GetRequirementByIdResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarResponse {

    private int id;
    private String plate;
    private int kilometer;
    private double dailyPrice;
    private int year;
    private String image;
    private String logo;
    private String modelName;
    private String colorName;
    private String brandName;
    private int seat;
    private int luggage;
    private String fuel;
    private String gear;
    private GetRequirementByIdResponse requirement;
}
