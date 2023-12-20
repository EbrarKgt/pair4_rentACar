package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.RentalService;
import com.example.pair4.services.dtos.rental.requests.AddRentalRequest;
import com.example.pair4.services.dtos.rental.requests.DeleteRentalRequest;
import com.example.pair4.services.dtos.rental.requests.UpdateRentalRequest;
import com.example.pair4.services.dtos.rental.responses.GetAllRentalResponse;
import com.example.pair4.services.dtos.rental.responses.GetRentalByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rentals")
@AllArgsConstructor
public class RentalsController {

    private final RentalService rentalService;

    @PostMapping("add")
    private void add(@RequestBody @Valid AddRentalRequest addRentalRequest) {
        rentalService.add(addRentalRequest);
    }

    @DeleteMapping
    private void delete(@RequestBody @Valid DeleteRentalRequest deleteRentalRequest) {
        rentalService.delete(deleteRentalRequest);
    }

    @PutMapping
    private void update(@RequestBody @Valid UpdateRentalRequest updateRentalRequest) {
        rentalService.update(updateRentalRequest);
    }

    @GetMapping("get-all-rentals")
    private List<GetAllRentalResponse> getAll() {
        return rentalService.getAll();
    }

    @GetMapping("/get/{id}")
    private GetRentalByIdResponse getByIdResponse(@PathVariable int id) {
        return rentalService.getRentalByIdResponse(id);
    }
}
