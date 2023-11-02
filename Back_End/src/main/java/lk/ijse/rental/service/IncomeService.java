package lk.ijse.rental.service;

import lk.ijse.rental.dto.IncomeDTO;

import java.util.ArrayList;

public interface IncomeService {

    ArrayList<IncomeDTO> dailyIncome();
    ArrayList<IncomeDTO> monthlyIncome();
    ArrayList<IncomeDTO> AnnuallyIncome();
}
