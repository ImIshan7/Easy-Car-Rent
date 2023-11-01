package lk.ijse.rental.controller;


import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/paymentIdGenerate")
    public @ResponseBody CustomDTO customerIdGenerate() {
        return service.paymentIdGenerate();
    }




}
