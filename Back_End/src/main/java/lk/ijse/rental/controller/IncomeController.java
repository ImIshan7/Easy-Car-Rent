package lk.ijse.rental.controller;


import lk.ijse.rental.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/income")
public class IncomeController {

    @Autowired
    private IncomeService service;


}
