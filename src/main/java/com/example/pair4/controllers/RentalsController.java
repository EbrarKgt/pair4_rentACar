package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.RentalService;
import com.example.pair4.services.dtos.rent.requests.AddRentRequest;
import com.example.pair4.services.dtos.rent.requests.DeleteRentRequest;
import com.example.pair4.services.dtos.rent.requests.UpdateRentRequest;
import com.example.pair4.services.dtos.rent.responses.GetAllRentResponse;
import com.example.pair4.services.dtos.rent.responses.GetRentByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rentals")
@AllArgsConstructor
public class RentalsController {

    private final RentalService rentalService;

    @PostMapping
    private void add(@RequestBody @Valid AddRentRequest addRentRequest) {
        rentalService.add(addRentRequest);
    }

    @DeleteMapping
    private void delete(@RequestBody @Valid DeleteRentRequest deleteRentRequest) {
        rentalService.delete(deleteRentRequest);
    }

    @PutMapping
    private void update(@RequestBody @Valid UpdateRentRequest updateRentRequest) {
        rentalService.update(updateRentRequest);
    }

    @GetMapping
    private List<GetAllRentResponse> getAll() {
        return rentalService.getAll();
    }

    @GetMapping("{id}")
    private GetRentByIdResponse getById(@PathVariable int id) {
        return rentalService.getByIdResponse(id);
    }
}
