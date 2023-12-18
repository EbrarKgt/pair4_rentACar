package com.example.pair4.services.dtos.brand.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {

    private int id;
    @Length(min = 2, message = "The brand name must have a minimum length of 2 letters.")
    private String brandName;

}
