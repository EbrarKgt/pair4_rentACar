package com.example.pair4.services.concretes;

import com.example.pair4.entities.Model;
import com.example.pair4.repositories.ModelRepository;
import com.example.pair4.services.abstracts.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private final ModelRepository modelRepository;

    @Override
    public Model getById(int id) {
        return modelRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no model with this id!"));
    }
}
