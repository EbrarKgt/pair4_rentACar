package com.example.pair4.services.concretes;

import com.example.pair4.entities.Color;
import com.example.pair4.repositories.ColorRepository;
import com.example.pair4.services.abstracts.ColorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ColorManager implements ColorService {

    private final ColorRepository colorRepository;
    @Override
    public Color getById(int id) {
        return colorRepository.findById(id).orElseThrow();
    }
}

