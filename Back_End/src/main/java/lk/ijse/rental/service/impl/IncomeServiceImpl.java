package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.IncomeDTO;
import lk.ijse.rental.service.IncomeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class IncomeServiceImpl implements IncomeService {
    @Override
    public ArrayList<IncomeDTO> dailyIncome() {
        return null;
    }

    @Override
    public ArrayList<IncomeDTO> monthlyIncome() {
        return null;
    }

    @Override
    public ArrayList<IncomeDTO> AnnuallyIncome() {
        return null;
    }
}
