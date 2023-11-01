package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.dto.PaymentDTO;
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

    }

    @Override
    public ArrayList<PaymentDTO> getAllPayment() {
        return null;
    }
}
