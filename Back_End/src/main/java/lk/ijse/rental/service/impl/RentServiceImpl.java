package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.dto.RentDTO;
import lk.ijse.rental.repo.CarRepo;
import lk.ijse.rental.repo.DriverRepo;
import lk.ijse.rental.repo.RentRepo;
import lk.ijse.rental.service.RentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;


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
