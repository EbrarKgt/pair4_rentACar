package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.Brand;
import com.example.pair4.entities.Model;
import com.example.pair4.repositories.ModelRepository;
import com.example.pair4.services.abstracts.BrandService;
import com.example.pair4.services.abstracts.ModelService;
import com.example.pair4.services.dtos.model.requests.AddModelRequest;
import com.example.pair4.services.dtos.model.requests.UpdateModelRequest;
import com.example.pair4.services.dtos.model.responses.GetAllModelResponse;
import com.example.pair4.services.dtos.model.responses.GetModelByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private final ModelRepository modelRepository;
    private final BrandService brandService;
    private final ModelMapperService modelMapperService;


    @Override
    public void add(AddModelRequest addModelRequest) {
        if (modelRepository.existsModelByName(addModelRequest.getName())) {
            throw new RuntimeException("The same model name cannot be registered twice.");
        }

        brandService.getById(addModelRequest.getBrandId());

        Model model = this.modelMapperService.forRequest().map(addModelRequest, Model.class);
        this.modelRepository.save(model);

    }

    @Override
    public void update(UpdateModelRequest updateModelRequest) {

        if (modelRepository.existsModelByName(updateModelRequest.getName())) {
            throw new RuntimeException("The same model name cannot be registered twice.");
        }

        brandService.getById(updateModelRequest.getBrandId());

        Model model = this.modelMapperService.forRequest().map(updateModelRequest, Model.class);
        this.modelRepository.save(model);

    }

    @Override
    public void delete(Integer id) {

        Model modelToDelete = this.modelRepository.findById(id).orElseThrow();
        this.modelRepository.deleteById(id);
    }

    @Override
    public List<GetAllModelResponse> getAll() {

        List<Model> modelList = modelRepository.findAll();
        List<GetAllModelResponse> modelResponses = modelList.stream()
                .map(model -> this.modelMapperService.forResponse().map(model, GetAllModelResponse.class)).toList();
        return modelResponses;
    }

    @Override
    public GetModelByIdResponse getModelByIdResponse(int id) {

        Model model = modelRepository.findById(id).orElseThrow();
        GetModelByIdResponse response = this.modelMapperService.forResponse().map(model, GetModelByIdResponse.class);
        return response;

    }

    @Override
    public Model getById(int id) {
        return modelRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no model with this id!"));
    }

}
