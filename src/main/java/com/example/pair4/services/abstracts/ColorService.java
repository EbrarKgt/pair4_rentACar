
package com.example.pair4.services.abstracts;

import com.example.pair4.entities.Color;
import com.example.pair4.services.dtos.color.requests.AddColorRequest;
import com.example.pair4.services.dtos.color.requests.DeleteColorRequest;
import com.example.pair4.services.dtos.color.requests.UpdateColorRequest;
import com.example.pair4.services.dtos.color.responses.GetAllColorResponse;
import com.example.pair4.services.dtos.color.responses.GetColorByIdResponse;

import java.util.List;

public interface ColorService {
    void add(AddColorRequest addColorRequest);
    void update(UpdateColorRequest updateColorRequest);
    void delete(DeleteColorRequest deleteColorRequest);
    List<GetAllColorResponse> getAll();
    GetColorByIdResponse getColorByIdResponse(int id);
    Color getById(int id);


}


