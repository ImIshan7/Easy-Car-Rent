package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.dto.PaymentDTO;
import lk.ijse.rental.entity.Car;
import lk.ijse.rental.entity.Driver;
import lk.ijse.rental.entity.Payment;
import lk.ijse.rental.entity.Rent;
import lk.ijse.rental.repo.CarRepo;
import lk.ijse.rental.repo.DriverRepo;
import lk.ijse.rental.repo.PaymentRepo;
import lk.ijse.rental.repo.RentRepo;
import lk.ijse.rental.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

import static lk.ijse.rental.enums.AvailabilityType.AVAILABLE;
import static lk.ijse.rental.enums.AvailabilityType.UNDER_MAINTAIN;
import static lk.ijse.rental.enums.RentRequest.PAY;


@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    private PaymentRepo paymentRepo;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private RentRepo rentRepo;

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private DriverRepo driverRepo;

    @Override
    public CustomDTO paymentIdGenerate() {

        return new CustomDTO(paymentRepo.getLastIndex());

    }

    @Override
    public void savePayment(PaymentDTO dto, String rentID) {

        Payment payment = mapper.map(dto, Payment.class);
        Rent rent = rentRepo.findById(rentID).get();
        if (rent.getRentDetails().get(0).getDriverID() != null) {

            Driver drivers = driverRepo.findById(rent.getRentDetails().get(0).getDriverID()).get();
            drivers.setDriverAvailability(AVAILABLE);
            driverRepo.save(drivers);

            Car car = carRepo.findById(rent.getRentDetails().get(0).getCarID()).get();
            car.setVehicleAvailabilityType(UNDER_MAINTAIN);
            carRepo.save(car);

            rent.setRentType(PAY);
            rentRepo.save(rent);
        }
        if (rent.getRentDetails().get(0).getDriverID() == null) {
            Car car = carRepo.findById(rent.getRentDetails().get(0).getCarID()).get();
            car.setVehicleAvailabilityType(UNDER_MAINTAIN);
            carRepo.save(car);

            rent.setRentType(PAY);
            rentRepo.save(rent);
        }
        paymentRepo.save(payment);

    }

    @Override
    public ArrayList<PaymentDTO> getAllPayment() {

        return mapper.map(paymentRepo.findAll(), new org.modelmapper.TypeToken<ArrayList<PaymentDTO>>() {
        }.getType());
    }
}
