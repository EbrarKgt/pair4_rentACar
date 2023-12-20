package com.example.pair4.services.abstracts;

import com.example.pair4.entities.Model;
import com.example.pair4.services.dtos.model.requests.AddModelRequest;
import com.example.pair4.services.dtos.model.requests.DeleteModelRequest;
import com.example.pair4.services.dtos.model.requests.UpdateModelRequest;
import com.example.pair4.services.dtos.model.responses.GetAllModelResponse;
import com.example.pair4.services.dtos.model.responses.GetModelByIdResponse;

import java.util.List;

public interface ModelService {
    void add(AddModelRequest addModelRequest);
    void update(UpdateModelRequest updateModelRequest);
    void delete(DeleteModelRequest deleteModelRequest);
    List<GetAllModelResponse> getAll();
    GetModelByIdResponse getModelByIdResponse(int id);
    Model getById(int id);
}

