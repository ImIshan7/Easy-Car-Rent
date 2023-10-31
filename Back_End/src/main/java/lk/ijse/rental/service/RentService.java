package lk.ijse.rental.service;

import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.dto.RentDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface RentService {

    CustomDTO rentIdGenerate();
    void bookingCars(@RequestBody RentDTO dto);
    CustomDTO getSumOfBooking();


}
