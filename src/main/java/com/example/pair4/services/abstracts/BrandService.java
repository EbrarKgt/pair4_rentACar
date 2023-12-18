package com.example.pair4.services.abstracts;

import com.example.pair4.entities.Brand;
import com.example.pair4.services.dtos.brand.requests.AddBrandRequest;
import com.example.pair4.services.dtos.brand.requests.DeleteBrandRequest;
import com.example.pair4.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.pair4.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.pair4.services.dtos.brand.responses.GetByIdBrandResponse;


import java.util.List;

public interface BrandService {

    boolean existsByBrandId(int brandId); // Silinmemesi gerekli model ile bağlantılı

    void add(AddBrandRequest addBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(DeleteBrandRequest deleteBrandRequest);
    List<GetAllBrandResponse> getAll();
    Brand getById(int id);
    GetByIdBrandResponse getByIdBrandResponse(int id);

}
