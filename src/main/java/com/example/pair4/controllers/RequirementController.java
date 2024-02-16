package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.RequirementService;
import com.example.pair4.services.dtos.requirement.responses.GetRequirementByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/requirements")
@AllArgsConstructor
public class RequirementController {

    private final RequirementService requirementService;


    @GetMapping("/get/{id}")
    private GetRequirementByIdResponse getByIdResponse(@PathVariable int id) {
        return requirementService.getRequirementByIdResponse(id);
    }
}
