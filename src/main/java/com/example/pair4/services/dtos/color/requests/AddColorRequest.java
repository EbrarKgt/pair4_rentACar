package com.example.pair4.services.dtos.color.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddColorRequest {

    @Length(min = 2, message = "There must be at least 2 letters in the colour to be added.")
    private String colorName;
}
