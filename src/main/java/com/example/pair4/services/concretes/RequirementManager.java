package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.Requirement;
import com.example.pair4.repositories.RequirementRepository;
import com.example.pair4.services.abstracts.RequirementService;
import com.example.pair4.services.dtos.requirement.responses.GetRequirementByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RequirementManager implements RequirementService {

    private final RequirementRepository requirementRepository;
    private final ModelMapperService modelMapperService;



    @Override
    public GetRequirementByIdResponse getRequirementByIdResponse(int id) {
        Requirement requirement = requirementRepository.findById(id).orElseThrow();
        GetRequirementByIdResponse getRequirementByIdResponse = this.modelMapperService.forResponse()
                .map(requirement, GetRequirementByIdResponse.class);

        return getRequirementByIdResponse;
    }



}
