package lk.ijse.rental.service;

import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.dto.RentDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public interface RentService {

    CustomDTO rentIdGenerate();
    void bookingCars(@RequestBody RentDTO dto);
    CustomDTO getSumOfBooking();
    CustomDTO getSumOfBookingPending();
    CustomDTO getSumOfBookingActive();
    ArrayList<RentDTO> getAllRent();
    void deleteRent(String rentID);
    void bookingConform(String rentID, String driverId);
    void bookingReject(String rentID, String driverId);
    RentDTO searchId(String id);

}
