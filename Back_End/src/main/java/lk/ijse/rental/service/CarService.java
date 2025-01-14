package lk.ijse.rental.service;

import lk.ijse.rental.dto.CarDTO;
import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.entity.Car;

import java.util.ArrayList;

public interface CarService {
    void saveCar(CarDTO dto);
    void updateCar(CarDTO dto);
    void deleteCar(String car_Id);
    ArrayList<CarDTO> getAllCar();
    CustomDTO carIdGenerate();
    Car searchCarId(String id);
    CustomDTO getSumCar();
    CustomDTO getSumAvailableCar();
    CustomDTO getSumReservedCar();
    CustomDTO getSumMaintainCar();
    CustomDTO getSumUnderMaintainCar();
    ArrayList<CarDTO> getFilerData(String type,String fuelType);
    ArrayList<CarDTO> filterCarDetails(String name, String fuel_Type,String type, String transmission_Type);
}
