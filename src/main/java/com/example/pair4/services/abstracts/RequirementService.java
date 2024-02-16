package com.example.pair4.services.abstracts;

import com.example.pair4.services.dtos.requirement.responses.GetRequirementByIdResponse;

public interface RequirementService {

    GetRequirementByIdResponse getRequirementByIdResponse(int id);
}
