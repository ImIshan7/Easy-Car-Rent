package lk.ijse.rental.controller;


import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.dto.RentDTO;
import lk.ijse.rental.service.RentService;
import lk.ijse.rental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/rent")
public class RentController {
    @Autowired
    private RentService service;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/rentIdGenerate")
    public @ResponseBody CustomDTO customerIdGenerate() {
        return service.rentIdGenerate();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil placeOrder(@RequestBody RentDTO dto) {
        service.bookingCars(dto);
        return new ResponseUtil("Ok", "Successfully Purchased.!", null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/booking")
    public @ResponseBody CustomDTO getSumOfBooking() {
        return service.getSumOfBooking();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/bookingPending")
    public @ResponseBody CustomDTO getSumOfBookingPending() {
        return service.getSumOfBookingPending();
    }

}
