package lk.ijse.rental.service;

import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.dto.PaymentDTO;

import java.util.ArrayList;

public interface PaymentService {

    CustomDTO paymentIdGenerate();
    void savePayment(PaymentDTO dto,String rentID);
    ArrayList<PaymentDTO> getAllPayment();
}
