package com.example.pair4.services.dtos.car.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {
    @Positive(message = "Enter a value greater than 0.")
    private int id;

    @Pattern(regexp = "^(0[1-9]|[1-7][0-9]|8[01])" +
            "(([A-Z])(\\d{4,5})|([A-Z]{2})(\\d{3,4})|([A-Z]{3})(\\d{2}))$",
            message = "Invalid licence plate format! Enter a licence plate in a format suitable for the TR licence plate.")
    private String plate;

    public void setPlate(String plate) {
        this.plate = plate != null ? plate.replaceAll("\\s", "") : null;
    }

    @Positive(message = "Enter a value greater than 0 for kilometer.")
    private int kilometer;

    @Positive(message = "Enter a value greater than 0₺ for daily price.")
    private double dailyPrice;

    @Min(value = 2005, message = "Enter a value greater than 2005 for the model year.")
    @Max(value = 2024, message = "Enter a value less than 2024 for the model year.")
    private int year;

    @Positive(message = "Enter a value greater than 0 for modelId.")
    private int modelId;

    @Positive(message = "Enter a value greater than 0 for colorId.")
    private int colorId;
}