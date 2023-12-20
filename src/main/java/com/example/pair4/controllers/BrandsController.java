package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.BrandService;
import com.example.pair4.services.dtos.brand.requests.AddBrandRequest;
import com.example.pair4.services.dtos.brand.requests.DeleteBrandRequest;
import com.example.pair4.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.pair4.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.pair4.services.dtos.brand.responses.GetBrandByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {
    private final BrandService brandService;

    @PostMapping("add")
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

    @GetMapping("get-all-brands")
    private List<GetAllBrandResponse> getAll() {
        return brandService.getAll();
    }

    @GetMapping("/get/{id}")
    private GetBrandByIdResponse getByIdResponse(@PathVariable int id) {
        return brandService.getBrandByIdResponse(id);
    }
}
