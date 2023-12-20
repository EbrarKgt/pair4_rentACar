package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.ModelService;
import com.example.pair4.services.dtos.model.requests.AddModelRequest;
import com.example.pair4.services.dtos.model.requests.UpdateModelRequest;
import com.example.pair4.services.dtos.model.responses.GetAllModelResponse;
import com.example.pair4.services.dtos.model.responses.GetModelByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/models")
public class ModelsController {
    private final ModelService modelService;

    @PostMapping("add")
    private void add(@RequestBody @Valid AddModelRequest addModelRequest) {
        modelService.add(addModelRequest);
    }

    @PutMapping
    private void update(@RequestBody @Valid UpdateModelRequest updateModelRequest) {
        modelService.update(updateModelRequest);
    }

    @DeleteMapping
    public void delete(@PathVariable Integer id) {
        modelService.delete(id);
    }

    @GetMapping("get-all-models")
    public List<GetAllModelResponse> getAll() {
        return modelService.getAll();
    }

    @GetMapping("/get/{id}")
    public GetModelByIdResponse getByIdResponse(@PathVariable int id) {
        return modelService.getModelByIdResponse(id);
    }
}
