package com.example.pair4.core.utilities.mappers;

import com.example.pair4.entities.Model;
import com.example.pair4.services.dtos.model.requests.AddModelRequest;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ModelMapperManager implements ModelMapperService {
    private ModelMapper modelMapper;

    @Override
    public ModelMapper forResponse() {
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE);

        return this.modelMapper;
    }

    @Override
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD);


        // Check if the TypeMap already exists
        TypeMap<AddModelRequest, Model> typeMap = this.modelMapper.getTypeMap(AddModelRequest.class, Model.class);

        // If the TypeMap doesn't exist, create a new one
        if (typeMap == null) {
            typeMap = this.modelMapper.createTypeMap(AddModelRequest.class, Model.class);

            // Explicitly skip mapping the 'id' field
            typeMap.addMappings(mapper -> mapper.skip(Model::setId));
        }
        return this.modelMapper;
    }
}
