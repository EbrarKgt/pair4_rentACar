package com.example.pair4.services.dtos.requirement.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetRequirementByIdResponse {

    private int id;
    private int minAge;
    private int minLicense;
    private int minCredit;
    private double rate;
    private double review;
}
