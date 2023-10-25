package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.AdminDTO;
import lk.ijse.rental.entity.Admin;
import lk.ijse.rental.repo.AdminRepo;
import lk.ijse.rental.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
@Service
@Transactional

public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveAdmin(AdminDTO dto) {

        if (repo.existsById(dto.getUser_Id())) {
            throw new RuntimeException("Admin Already Exist. Please enter another id..!");
        }
        repo.save(mapper.map(dto, Admin.class));

    }

    @Override
    public void updateAdmin(AdminDTO dto) {
        if (!repo.existsById(dto.getUser_Id())) {
            throw new RuntimeException("Admin Not Exist. Please enter Valid id..!");
        }
        repo.save(mapper.map(dto, Admin.class));
    }

    @Override
    public void deleteAdmin(String reg_ID) {

    }

    @Override
    public ArrayList<AdminDTO> getAllAdmin() {
        return null;
    }
}
