package com.example.pair4.services.dtos.model.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddModelRequest {
    @NotBlank
    @Size(min = 2, message = "En az 2 harften oluşmalıdır!")
    private String name;

    @Positive(message = "Doğru BradId girişi yapılmalıdır!")
    private int brandId;
}

