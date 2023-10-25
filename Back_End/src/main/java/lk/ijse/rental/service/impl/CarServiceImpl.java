package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.CarDTO;
import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.entity.Car;
import lk.ijse.rental.service.CarService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;


@Service
@Transactional
public class CarServiceImpl  implements CarService {
    @Override
    public void saveCar(CarDTO dto) {

    }

    @Override
    public void updateCar(CarDTO dto) {

    }

    @Override
    public void deleteCar(String car_Id) {

    }

    @Override
    public ArrayList<CarDTO> getAllCar() {
        return null;
    }

    @Override
    public CustomDTO carIdGenerate() {
        return null;
    }

    @Override
    public Car searchCarId(String id) {
        return null;
    }

    @Override
    public CustomDTO getSumCar() {
        return null;
    }

    @Override
    public CustomDTO getSumAvailableCar() {
        return null;
    }

    @Override
    public CustomDTO getSumReservedCar() {
        return null;
    }

    @Override
    public CustomDTO getSumMaintainCar() {
        return null;
    }

    @Override
    public CustomDTO getSumUnderMaintainCar() {
        return null;
    }

    @Override
    public ArrayList<CarDTO> getFilerData(String type, String fuelType) {
        return null;
    }

    @Override
    public ArrayList<CarDTO> filterCarDetails(String name, String fuel_Type, String type, String transmission_Type) {
        return null;
    }
}
