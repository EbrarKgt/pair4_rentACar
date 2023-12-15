package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.Car;
import com.example.pair4.entities.Color;
import com.example.pair4.entities.Model;
import com.example.pair4.repositories.CarRepository;
import com.example.pair4.services.abstracts.CarService;
import com.example.pair4.services.abstracts.ColorService;
import com.example.pair4.services.abstracts.ModelService;
import com.example.pair4.services.dtos.car.requests.AddCarRequest;
import com.example.pair4.services.dtos.car.requests.DeleteCarRequest;
import com.example.pair4.services.dtos.car.requests.UpdateCarRequest;
import com.example.pair4.services.dtos.car.responses.GetAllCarResponse;
import com.example.pair4.services.dtos.car.responses.GetByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private final CarRepository carRepository;
    private final ModelService modelService;
    private final ColorService colorService;
    private final ModelMapperService modelMapperService;
    @Override
    public void add(AddCarRequest addCarRequest) {

          Car car = this.modelMapperService.forRequest().map(addCarRequest, Car.class);
          this.carRepository.save(car);
    }

    @Override
    public void update(UpdateCarRequest updateCarRequest) {
        Car carToUpdate = carRepository.findById(updateCarRequest.getId()).orElseThrow();
        carToUpdate.setKilometer(updateCarRequest.getKilometer());
        carToUpdate.setPlate(updateCarRequest.getPlate());
        carToUpdate.setYear(updateCarRequest.getYear());
        carToUpdate.setDailyPrice(updateCarRequest.getDailyPrice());

        Model model = modelService.getById(updateCarRequest.getModelId());
        carToUpdate.setModel(model);

        Color color = colorService.getById(updateCarRequest.getColorId());
        carToUpdate.setColor(color);

        carRepository.save(carToUpdate);

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
                .map(car -> this.modelMapperService.forResponse().map(car,GetAllCarResponse.class))
                .toList();
        return carResponses;

    }

    @Override
    public GetByIdResponse getById(int id) {
        return null;
    }
}

// @NoArgsConstructor :)
