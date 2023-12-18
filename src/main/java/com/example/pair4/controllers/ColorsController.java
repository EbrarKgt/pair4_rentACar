package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.ColorService;
import com.example.pair4.services.dtos.car.responses.GetByIdResponse;
import com.example.pair4.services.dtos.color.requests.AddColorRequest;
import com.example.pair4.services.dtos.color.requests.DeleteColorRequest;
import com.example.pair4.services.dtos.color.requests.UpdateColorRequest;
import com.example.pair4.services.dtos.color.responses.GetAllColorResponse;
import com.example.pair4.services.dtos.color.responses.GetByIdColorResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/colors")
@AllArgsConstructor
public class ColorsController {

    private final ColorService colorService;

    @PostMapping
    private void add(@RequestBody @Valid AddColorRequest addColorRequest) {

        colorService.add(addColorRequest);
    }

    @DeleteMapping
    private void delete(@RequestBody @Valid DeleteColorRequest deleteColorRequest) {
        colorService.delete(deleteColorRequest);
    }

    @PutMapping
    private void update(@RequestBody @Valid UpdateColorRequest updateColorRequest) {
        colorService.update(updateColorRequest);
    }

    @GetMapping
    private List<GetAllColorResponse> getAll() {
        return colorService.getAll();
    }

    @GetMapping("{id}")
    private GetByIdColorResponse getByIdColorResponse(@PathVariable int id) {
        return colorService.getByIdColorResponse(id);
    }
}
