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
    @Positive(message = "ID 0 dan büyük olmalı.")
    private int id;
    @Pattern(regexp = "^(0[1-9]|[1-7][0-9]|8[01])(([A-Z])(\\d{4,5})|([A-Z]{2})(\\d{3,4})|([A-Z]{3})(\\d{2}))$", message = "TR plakasına uymuyor.")
    private String plate;
    public void setPlate(String plate) {
        this.plate = plate != null ? plate.replaceAll("\\s", "") : null;
    }
    @Positive(message = "Kilometre 0 dan küçük olamaz.")
    private int kilometer;
    @Positive(message = "Günlük kira ücreti 0 dan küçük olamaz.")
    private double dailyPrice;
    @Min(value = 2005, message = "Model yılı 2005 den az olamaz.")
    @Max(value = 2024, message = "Model yılı 2024 den fazla olamaz.")
    private int year;
    @Positive(message = "ID 0 dan büyük olmalı.")
    private int modelId;
    @Positive(message = "ID 0 dan büyük olmalı.")
    private int colorId;
}
