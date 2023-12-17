package com.example.pair4.services.abstracts;

import com.example.pair4.entities.Rental;
import com.example.pair4.services.dtos.rent.requests.AddRentRequest;
import com.example.pair4.services.dtos.rent.requests.DeleteRentRequest;
import com.example.pair4.services.dtos.rent.requests.UpdateRentRequest;
import com.example.pair4.services.dtos.rent.responses.GetAllRentResponse;
import com.example.pair4.services.dtos.rent.responses.GetRentByIdResponse;

import java.util.List;

public interface RentalService {

    void add(AddRentRequest addRentRequest);
    void delete(DeleteRentRequest deleteRentRequest);
    void update(UpdateRentRequest updateRentRequest);
    List<GetAllRentResponse> getAll();
    GetRentByIdResponse getByIdResponse(int id);
    Rental getById(int id);
}
