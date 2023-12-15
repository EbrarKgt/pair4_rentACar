package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.Color;
import com.example.pair4.repositories.ColorRepository;
import com.example.pair4.services.abstracts.ColorService;
import com.example.pair4.services.dtos.color.requests.AddColorRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


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
}

