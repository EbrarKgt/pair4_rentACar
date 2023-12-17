package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.Car;
import com.example.pair4.entities.Rental;
import com.example.pair4.repositories.RentalRepository;
import com.example.pair4.services.abstracts.CarService;
import com.example.pair4.services.abstracts.RentalService;
import com.example.pair4.services.abstracts.UserService;
import com.example.pair4.services.dtos.rent.requests.AddRentRequest;
import com.example.pair4.services.dtos.rent.requests.DeleteRentRequest;
import com.example.pair4.services.dtos.rent.requests.UpdateRentRequest;
import com.example.pair4.services.dtos.rent.responses.GetAllRentResponse;
import com.example.pair4.services.dtos.rent.responses.GetRentByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {

    private final RentalRepository rentalRepository;
    private final CarService carService;
    private final UserService userService;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddRentRequest addRentRequest) {

        if(addRentRequest.getEndDate().isBefore(addRentRequest.getStartDate())){
            throw new RuntimeException("The end date cannot be later than the start date.");
        }

        long totalRentDay = ChronoUnit.DAYS.between(addRentRequest.getStartDate(),addRentRequest.getEndDate());

        if(totalRentDay > 25){
            throw new RuntimeException("A vehicle can be rented for a maximum of 25 days.");
        }

        //Check is there anything corresponding to this id?
        carService.getById(addRentRequest.getCarId());
        userService.getById(addRentRequest.getUserId());

        Rental rental = this.modelMapperService.forRequest().map(addRentRequest, Rental.class);

        Car car = carService.getById(addRentRequest.getCarId());
        rental.setStartKilometer(car.getKilometer());
        rental.setTotalPrice(totalRentDay * car.getDailyPrice());

        rentalRepository.save(rental);

    }

    @Override
    public void delete(DeleteRentRequest deleteRentRequest) {
        Rental rentalToDelete = rentalRepository.findById(deleteRentRequest.getId()).orElseThrow();
        rentalRepository.delete(rentalToDelete);
    }

    @Override
    public void update(UpdateRentRequest updateRentRequest) {
        if(updateRentRequest.getEndDate().isBefore(updateRentRequest.getStartDate())){
            throw new RuntimeException("The end date cannot be later than the start date.");
        }

        long totalRentDay = ChronoUnit.DAYS.between(updateRentRequest.getStartDate(),updateRentRequest.getEndDate());

        if(totalRentDay > 25){
            throw new RuntimeException("A vehicle can be rented for a maximum of 25 days.");
        }
        //Check is there anything corresponding to this id?
        carService.getById(updateRentRequest.getCarId());
        userService.getById(updateRentRequest.getUserId());

        Rental rentalToUpdate = this.modelMapperService.forRequest().map(updateRentRequest, Rental.class);

        Car car = carService.getById(updateRentRequest.getCarId());
        rentalToUpdate.setStartKilometer(car.getKilometer());
        rentalToUpdate.setTotalPrice(totalRentDay * car.getDailyPrice());

        rentalRepository.save(rentalToUpdate);
    }

    @Override
    public List<GetAllRentResponse> getAll() {
        List<Rental> rentals = rentalRepository.findAll();
        List<GetAllRentResponse> rentResponses = rentals.stream()
                .map(rental -> this.modelMapperService.forResponse().map(rental,GetAllRentResponse.class))
                .toList();

        return rentResponses;
    }

    @Override
    public GetRentByIdResponse getByIdResponse(int id) {
        Rental rental = rentalRepository.findById(id).orElseThrow();
        GetRentByIdResponse getRentByIdResponse = this.modelMapperService.forResponse()
                .map(rental, GetRentByIdResponse.class);

        return getRentByIdResponse;
    }

    @Override
    public Rental getById(int id) {
        return rentalRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no car with this id!"));
    }

}
