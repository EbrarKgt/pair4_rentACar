package com.example.pair4.services.dtos.model.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllModelResponse {
    private int id;
    private String name;
    private int brandId;
}
