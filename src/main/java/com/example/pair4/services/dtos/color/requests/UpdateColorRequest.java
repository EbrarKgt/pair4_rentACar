package com.example.pair4.services.dtos.color.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateColorRequest {
    private int id;
    @Length(min = 2, message = "The color name must have a minimum length of 2 letters.")
    private String colorName;
}
