package com.example.pair4.services.abstracts;

import com.example.pair4.entities.Rental;
import com.example.pair4.services.dtos.rental.requests.AddRentalRequest;
import com.example.pair4.services.dtos.rental.requests.DeleteRentalRequest;
import com.example.pair4.services.dtos.rental.requests.UpdateRentalRequest;
import com.example.pair4.services.dtos.rental.responses.GetAllRentalResponse;
import com.example.pair4.services.dtos.rental.responses.GetRentalByIdResponse;

import java.util.List;

public interface RentalService {
    void add(AddRentalRequest addRentalRequest);
    void delete(DeleteRentalRequest deleteRentalRequest);
    void update(UpdateRentalRequest updateRentalRequest);
    List<GetAllRentalResponse> getAll();
    GetRentalByIdResponse getRentalByIdResponse(int id);
    Rental getById(int id);
}
