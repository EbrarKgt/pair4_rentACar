package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.BrandService;
import com.example.pair4.services.dtos.brand.requests.AddBrandRequest;
import com.example.pair4.services.dtos.brand.requests.DeleteBrandRequest;
import com.example.pair4.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.pair4.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.pair4.services.dtos.brand.responses.GetByIdBrandResponse;
import com.example.pair4.services.dtos.car.responses.GetByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {
    private final BrandService brandService;

    @PostMapping
    private void add(@RequestBody @Valid AddBrandRequest addBrandRequest) {

        brandService.add(addBrandRequest);
    }

    @DeleteMapping
    private void delete(@RequestBody @Valid DeleteBrandRequest deleteBrandRequest) {
        brandService.delete(deleteBrandRequest);
    }

    @PutMapping
    private void update(@RequestBody @Valid UpdateBrandRequest updateBrandRequest) {
        brandService.update(updateBrandRequest);
    }

    @GetMapping
    private List<GetAllBrandResponse> getAll() {
        return brandService.getAll();
    }

    @GetMapping("{id}")
    private GetByIdBrandResponse getById(@PathVariable int id) {
        return brandService.getByIdBrandResponse(id);
    }
}
