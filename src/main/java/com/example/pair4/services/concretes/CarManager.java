package com.example.pair4.services.concretes;

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

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private final CarRepository carRepository;
    private final ModelService modelService;
    private final ColorService colorService;

    @Override
    public void add(AddCarRequest addCarRequest) {

        Car car = new Car();

        car.setKilometer(addCarRequest.getKilometer());

        car.setPlate(addCarRequest.getPlate());

        car.setYear(addCarRequest.getYear());

        car.setDailyPrice(addCarRequest.getDailyPrice());

        Model model = modelService.getById(addCarRequest.getModelId());
        car.setModel(model);

        Color color = colorService.getById(addCarRequest.getColorId());
        car.setColor(color);

        carRepository.save(car);


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
        return carRepository.getAll();
        ///////////////


    }

    @Override
    public GetByIdResponse getById(int id) {
        return null;
    }
}

// @NoArgsConstructor :)
