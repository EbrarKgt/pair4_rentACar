package com.example.pair4.services.abstracts;

import com.example.pair4.services.dtos.car.requests.AddCarRequest;
import com.example.pair4.services.dtos.car.requests.DeleteCarRequest;
import com.example.pair4.services.dtos.car.requests.UpdateCarRequest;
import com.example.pair4.services.dtos.car.responses.GetAllCarResponse;
import com.example.pair4.services.dtos.car.responses.GetByIdResponse;

import java.util.List;

public interface CarService {
    void add(AddCarRequest addCarRequest);

    void update(UpdateCarRequest updateCarRequest);
    void delete(DeleteCarRequest deleteCarRequest);

    List<GetAllCarResponse> getAll();

    GetByIdResponse getById(int id);

}
