
package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.Color;
import com.example.pair4.repositories.ColorRepository;
import com.example.pair4.services.abstracts.ColorService;
import com.example.pair4.services.dtos.color.requests.AddColorRequest;
import com.example.pair4.services.dtos.color.requests.DeleteColorRequest;
import com.example.pair4.services.dtos.color.requests.UpdateColorRequest;
import com.example.pair4.services.dtos.color.responses.GetAllColorResponse;
import com.example.pair4.services.dtos.color.responses.GetByIdColorResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ColorManager implements ColorService {

    private final ColorRepository colorRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public Color getById(int id) {
        return colorRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no color with this id!"));
    }


    @Override
    public void add(AddColorRequest addColorRequest) {

        if (colorRepository.existsColorByName(addColorRequest.getColorName())) {
            throw new RuntimeException("The same color cannot be registered twice.");
        }

        Color color = this.modelMapperService.forRequest().map(addColorRequest, Color.class);
        this.colorRepository.save(color);
    }

    @Override
    public void update(UpdateColorRequest updateColorRequest) {
        Color colorToUpdate = this.modelMapperService.forRequest().map(updateColorRequest, Color.class);
        this.colorRepository.save(colorToUpdate);
    }

    @Override
    public void delete(DeleteColorRequest deleteColorRequest) {
        Color colorToDelete = colorRepository.findById(deleteColorRequest.getId()).orElseThrow();
        colorRepository.delete(colorToDelete);
    }

    @Override
    public List<GetAllColorResponse> getAll() {
        List<Color> colors = colorRepository.findAll();
        List<GetAllColorResponse> colorResponses = colors.stream()
                .map(color -> this.modelMapperService.forResponse().map(color,GetAllColorResponse.class))
                .toList();
        return colorResponses;
    }


    public GetByIdColorResponse getByIdColorResponse(int id) {
        Color color = this.colorRepository.findById(id).orElseThrow();
        GetByIdColorResponse getByIdColorResponse = this.modelMapperService.forResponse()
                .map(color,GetByIdColorResponse.class);
        return getByIdColorResponse;
    }




}


