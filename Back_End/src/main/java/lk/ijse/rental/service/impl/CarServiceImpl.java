package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.CarDTO;
import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.embeded.Image;
import lk.ijse.rental.entity.Car;
import lk.ijse.rental.repo.CarRepo;
import lk.ijse.rental.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;


@Service
@Transactional
public class CarServiceImpl  implements CarService {

    @Autowired
    private CarRepo repo;
    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveCar(CarDTO dto) {

        Car car = new Car(dto.getCar_Id(), dto.getName(), dto.getBrand(), dto.getType(), new Image(), dto.getNumber_Of_Passengers(), dto.getTransmission_Type(), dto.getFuel_Type(), dto.getRent_Duration_Price(), dto.getPrice_Extra_KM(), dto.getRegistration_Number(), dto.getFree_Mileage(), dto.getColor(), dto.getVehicleAvailabilityType());
        if (repo.existsById(dto.getCar_Id())) {
            throw new RuntimeException("Car Already Exist. Please enter another id..!");
        }

        try {

            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
            System.out.println(projectPath);
            uploadsDir.mkdir();

            dto.getImage().getFront_View().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getImage().getFront_View().getOriginalFilename()));
            dto.getImage().getBack_View().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getImage().getBack_View().getOriginalFilename()));
            dto.getImage().getSide_View().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getImage().getSide_View().getOriginalFilename()));
            dto.getImage().getInterior().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getImage().getInterior().getOriginalFilename()));

            car.getImage().setFront_View("uploads/"+dto.getImage().getFront_View().getOriginalFilename());
            car.getImage().setBack_View("uploads/"+dto.getImage().getBack_View().getOriginalFilename());
            car.getImage().setSide_View("uploads/"+dto.getImage().getSide_View().getOriginalFilename());
            car.getImage().setInterior("uploads/"+dto.getImage().getInterior().getOriginalFilename());

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

        System.out.println(car);
        repo.save(car);

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
