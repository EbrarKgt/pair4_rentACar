package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.Car;
import com.example.pair4.repositories.CarRepository;
import com.example.pair4.services.abstracts.CarService;
import com.example.pair4.services.abstracts.ColorService;
import com.example.pair4.services.abstracts.ModelService;
import com.example.pair4.services.dtos.car.requests.AddCarRequest;
import com.example.pair4.services.dtos.car.requests.DeleteCarRequest;
import com.example.pair4.services.dtos.car.requests.UpdateCarRequest;
import com.example.pair4.services.dtos.car.responses.GetAllCarResponse;
import com.example.pair4.services.dtos.car.responses.GetCarByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private final CarRepository carRepository;
    private final ModelService modelService;
    private final ColorService colorService;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddCarRequest addCarRequest) {
        if (carRepository.existsCarByPlate(addCarRequest.getPlate())) {
            throw new RuntimeException("The same plate cannot be registered twice.");
        }
        modelService.getById(addCarRequest.getModelId());
        colorService.getById(addCarRequest.getColorId());

        Car car = this.modelMapperService.forRequest().map(addCarRequest, Car.class);
        this.carRepository.save(car);
    }

    @Override
    public void update(UpdateCarRequest updateCarRequest) {
        Car carToUpdate = this.modelMapperService.forRequest().map(updateCarRequest, Car.class);
        this.carRepository.save(carToUpdate);
    }

    @Override
    public void delete(DeleteCarRequest deleteCarRequest) {
        Car carToDelete = carRepository.findById(deleteCarRequest.getId()).orElseThrow();
        carRepository.delete(carToDelete);
    }

    @Override
    public List<GetAllCarResponse> getAll() {
        List<Car> cars = carRepository.findAll();
        List<GetAllCarResponse> carResponses = cars.stream()
                .map(car -> this.modelMapperService.forResponse().map(car, GetAllCarResponse.class))
                .toList();
        return carResponses;
    }

    @Override
    public GetCarByIdResponse getCarByIdResponse(int id) {
        Car car = this.carRepository.findById(id).orElseThrow();
        GetCarByIdResponse getCarByIdResponse = this.modelMapperService.forResponse()
                .map(car, GetCarByIdResponse.class);
        return getCarByIdResponse;
    }

    @Override
    public Car getById(int id) {
        return carRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no car with this id!"));
    }
}
