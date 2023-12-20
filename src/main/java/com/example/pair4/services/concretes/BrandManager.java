
package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.Brand;
import com.example.pair4.repositories.BrandRepository;
import com.example.pair4.services.abstracts.BrandService;
import com.example.pair4.services.dtos.brand.requests.AddBrandRequest;
import com.example.pair4.services.dtos.brand.requests.DeleteBrandRequest;
import com.example.pair4.services.dtos.brand.requests.UpdateBrandRequest;
import com.example.pair4.services.dtos.brand.responses.GetAllBrandResponse;
import com.example.pair4.services.dtos.brand.responses.GetBrandByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddBrandRequest addBrandRequest) {

        if (brandRepository.existsBrandByName(addBrandRequest.getBrandName())) {
            throw new RuntimeException("The same brand cannot be registered twice.");
        }

        Brand brand = this.modelMapperService.forRequest().map(addBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brandToUpdate = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brandToUpdate);
    }

    @Override
    public void delete(DeleteBrandRequest deleteBrandRequest) {
        Brand brandToDelete = brandRepository.findById(deleteBrandRequest.getId()).orElseThrow();
        brandRepository.delete(brandToDelete);
    }

    @Override
    public List<GetAllBrandResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandResponse> brandResponses = brands.stream()
                .map(brand -> this.modelMapperService.forResponse().map(brand,GetAllBrandResponse.class))
                .toList();
        return brandResponses;
    }


    public GetBrandByIdResponse getBrandByIdResponse(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        GetBrandByIdResponse getBrandByIdResponse = this.modelMapperService.forResponse()
                .map(brand, GetBrandByIdResponse.class);
        return getBrandByIdResponse;
    }

    @Override
    public Brand getById(int id) {
        return brandRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no brand with this id!"));
    }
}

