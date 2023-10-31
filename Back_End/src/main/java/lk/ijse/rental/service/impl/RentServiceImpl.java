package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.dto.RentDTO;
import lk.ijse.rental.entity.Car;
import lk.ijse.rental.entity.Driver;
import lk.ijse.rental.entity.Rent;
import lk.ijse.rental.entity.RentDetails;
import lk.ijse.rental.enums.RequestType;
import lk.ijse.rental.repo.CarRepo;
import lk.ijse.rental.repo.DriverRepo;
import lk.ijse.rental.repo.RentRepo;
import lk.ijse.rental.service.RentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static lk.ijse.rental.enums.AvailabilityType.UNAVAILABLE;


@Service
@Transactional
public class RentServiceImpl implements RentService {

    @Autowired
    private RentRepo rentRepo;
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private DriverRepo driverRepo;
    @Autowired
    private ModelMapper mapper;

    @Override
    public CustomDTO rentIdGenerate() {
        return new CustomDTO(rentRepo.getLastIndex());
    }

    @Override
    public void bookingCars(RentDTO dto) {
        Rent rent = mapper.map(dto, Rent.class);
        if (rentRepo.existsById(dto.getRentID())) {
            throw new RuntimeException("Booking" + dto.getRentID() + " Already added.!");
        }

        if (dto.getRequestType().equals(RequestType.YES)) {
            List<Driver> drivers = driverRepo.availableDrivers();
            int x;

            for (RentDetails rentDetails : rent.getRentDetails()) {
                x = new Random().nextInt(drivers.size());
                rentDetails.setDriverID(drivers.get(x).getUser_Id());
                Car car = carRepo.findById(rentDetails.getCarID()).get();
                car.setVehicleAvailabilityType(UNAVAILABLE);
                carRepo.save(car);
                drivers.get(x).setDriverAvailability(UNAVAILABLE);
                driverRepo.save(drivers.get(x));
            }
        } else if (dto.getRequestType().equals(RequestType.NO)) {
            for (RentDetails rentDetails : rent.getRentDetails()) {
                Car car = carRepo.findById(rentDetails.getCarID()).get();
                car.setVehicleAvailabilityType(UNAVAILABLE);
                carRepo.save(car);
            }
        }

        rentRepo.save(rent);

    }

    @Override
    public CustomDTO getSumOfBooking() {
        return null;
    }

    @Override
    public CustomDTO getSumOfBookingPending() {
        return null;
    }

    @Override
    public CustomDTO getSumOfBookingActive() {
        return null;
    }

    @Override
    public ArrayList<RentDTO> getAllRent() {
        return null;
    }

    @Override
    public void deleteRent(String rentID) {

    }

    @Override
    public void bookingConform(String rentID, String driverId) {

    }

    @Override
    public void bookingReject(String rentID, String driverId) {

    }

    @Override
    public RentDTO searchId(String id) {
        return null;
    }
}
