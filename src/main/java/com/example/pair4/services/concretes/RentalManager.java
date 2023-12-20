package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.Car;
import com.example.pair4.entities.Rental;
import com.example.pair4.repositories.RentalRepository;
import com.example.pair4.services.abstracts.CarService;
import com.example.pair4.services.abstracts.RentalService;
import com.example.pair4.services.abstracts.UserService;
import com.example.pair4.services.dtos.rental.requests.AddRentalRequest;
import com.example.pair4.services.dtos.rental.requests.DeleteRentalRequest;
import com.example.pair4.services.dtos.rental.requests.UpdateRentalRequest;
import com.example.pair4.services.dtos.rental.responses.GetAllRentalResponse;
import com.example.pair4.services.dtos.rental.responses.GetRentalByIdResponse;
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
    public void add(AddRentalRequest addRentalRequest) {

        if (addRentalRequest.getEndDate().isBefore(addRentalRequest.getStartDate())) {
            throw new RuntimeException("The end date cannot be later than the start date.");
        }

        long totalRentDay = ChronoUnit.DAYS.between(addRentalRequest.getStartDate(), addRentalRequest.getEndDate());

        if (totalRentDay > 25) {
            throw new RuntimeException("A vehicle can be rented for a maximum of 25 days.");
        }

        //Check is there anything corresponding to this id?
        carService.getById(addRentalRequest.getCarId());
        userService.getById(addRentalRequest.getUserId());

        Rental rental = this.modelMapperService.forRequest().map(addRentalRequest, Rental.class);

        Car car = carService.getById(addRentalRequest.getCarId());
        rental.setStartKilometer(car.getKilometer());
        rental.setTotalPrice(totalRentDay * car.getDailyPrice());

        rentalRepository.save(rental);

    }

    @Override
    public void delete(DeleteRentalRequest deleteRentalRequest) {
        Rental rentalToDelete = rentalRepository.findById(deleteRentalRequest.getId()).orElseThrow();
        rentalRepository.delete(rentalToDelete);
    }

    @Override
    public void update(UpdateRentalRequest updateRentalRequest) {
        if (updateRentalRequest.getEndDate().isBefore(updateRentalRequest.getStartDate())) {
            throw new RuntimeException("The end date cannot be later than the start date.");
        }

        long totalRentDay = ChronoUnit.DAYS.between(updateRentalRequest.getStartDate(), updateRentalRequest.getEndDate());

        if (totalRentDay > 25) {
            throw new RuntimeException("A vehicle can be rented for a maximum of 25 days.");
        }
        //Check is there anything corresponding to this id?
        carService.getById(updateRentalRequest.getCarId());
        userService.getById(updateRentalRequest.getUserId());

        Rental rentalToUpdate = this.modelMapperService.forRequest().map(updateRentalRequest, Rental.class);

        Car car = carService.getById(updateRentalRequest.getCarId());
        rentalToUpdate.setStartKilometer(car.getKilometer());
        rentalToUpdate.setTotalPrice(totalRentDay * car.getDailyPrice());

        rentalRepository.save(rentalToUpdate);
    }

    @Override
    public List<GetAllRentalResponse> getAll() {
        List<Rental> rentals = rentalRepository.findAll();
        List<GetAllRentalResponse> rentResponses = rentals.stream()
                .map(rental -> this.modelMapperService.forResponse().map(rental, GetAllRentalResponse.class))
                .toList();

        return rentResponses;
    }

    @Override
    public GetRentalByIdResponse getRentalByIdResponse(int id) {
        Rental rental = rentalRepository.findById(id).orElseThrow();
        GetRentalByIdResponse getRentalByIdResponse = this.modelMapperService.forResponse()
                .map(rental, GetRentalByIdResponse.class);

        return getRentalByIdResponse;
    }

    @Override
    public Rental getById(int id) {
        return rentalRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no rental with this id!"));
    }

}
