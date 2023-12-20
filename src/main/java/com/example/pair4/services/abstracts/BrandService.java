package com.example.pair4.services.abstracts;

import com.example.pair4.entities.Brand;
import com.example.pair4.services.dtos.brand.requests.AddBrandRequest;
import com.example.pair4.services.dtos.brand.requests.DeleteBrandRequest;
import com.example.pair4.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.pair4.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.pair4.services.dtos.brand.responses.GetBrandByIdResponse;


import java.util.List;

public interface BrandService {
    void add(AddBrandRequest addBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(DeleteBrandRequest deleteBrandRequest);
    List<GetAllBrandResponse> getAll();
    GetBrandByIdResponse getBrandByIdResponse(int id);
    Brand getById(int id);

}
