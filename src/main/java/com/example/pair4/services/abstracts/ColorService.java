package com.example.pair4.services.abstracts;

import com.example.pair4.entities.Color;
import com.example.pair4.services.dtos.color.requests.AddColorRequest;

public interface ColorService {

    Color getById(int id);

    void add(AddColorRequest addColorRequest);
}
