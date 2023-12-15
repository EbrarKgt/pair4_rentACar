package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.CarService;
import com.example.pair4.services.abstracts.ColorService;
import com.example.pair4.services.dtos.car.requests.AddCarRequest;
import com.example.pair4.services.dtos.color.requests.AddColorRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/colors")
@AllArgsConstructor
public class ColorsController {

    private final ColorService colorService;

    @PostMapping
    private void add(@RequestBody @Valid AddColorRequest addColorRequest){

        colorService.add(addColorRequest);

    }

}
