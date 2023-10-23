package lk.ijse.rental.service;

import lk.ijse.rental.dto.CustomDTO;
import lk.ijse.rental.dto.CustomerDTO;
import lk.ijse.rental.entity.Customer;

import java.util.ArrayList;

public interface CustomerService {

    void saveCustomer(CustomerDTO dto);
    void updateCustomer(CustomerDTO dto);
    void deleteCustomer(String reg_ID);
    ArrayList<CustomerDTO> getAllCustomer();
    CustomDTO CustomerIdGenerate();
   Customer searchCusId(String id);
    CustomDTO getSumCustomer();
   Customer availableCustomer(String userName);

}
