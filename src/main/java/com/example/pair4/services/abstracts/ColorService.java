package com.example.pair4.services.abstracts;

import com.example.pair4.entities.Color;
import com.example.pair4.services.dtos.car.requests.AddCarRequest;
import com.example.pair4.services.dtos.car.requests.DeleteCarRequest;
import com.example.pair4.services.dtos.car.requests.UpdateCarRequest;
import com.example.pair4.services.dtos.car.responses.GetAllCarResponse;
import com.example.pair4.services.dtos.car.responses.GetByIdResponse;
import com.example.pair4.services.dtos.color.requests.AddColorRequest;
import com.example.pair4.services.dtos.color.requests.DeleteColorRequest;
import com.example.pair4.services.dtos.color.requests.UpdateColorRequest;
import com.example.pair4.services.dtos.color.responses.GetAllColorResponse;
import com.example.pair4.services.dtos.color.responses.GetByIdColorResponse;

import java.util.List;

public interface ColorService {

    void add(AddColorRequest addColorRequest);
    void update(UpdateColorRequest updateColorRequest);
    void delete(DeleteColorRequest deleteColorRequest);
    List<GetAllColorResponse> getAll();
    Color getById(int id);
    GetByIdColorResponse getByIdColorResponse(int id);


}




