package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.dto.PaymentDTO;
import lk.ijse.rental.service.PaymentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;


@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Override
    public CustomDTO paymentIdGenerate() {
        return null;
    }

    @Override
    public void savePayment(PaymentDTO dto, String rentID) {

    }

    @Override
    public ArrayList<PaymentDTO> getAllPayment() {
        return null;
    }
}
