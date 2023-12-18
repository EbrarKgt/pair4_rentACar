package com.example.pair4.services.dtos.color.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddColorRequest {

<<<<<<< HEAD
    @Length(min = 2, message = "The color name must have a minimum length of 2 letters.")
=======
    @Length(min = 2, message = "There must be at least 2 letters in the colour to be added.")
>>>>>>> refs/remotes/origin/main
    private String colorName;
}
