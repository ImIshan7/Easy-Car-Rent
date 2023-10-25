package lk.ijse.rental.service;

import lk.ijse.rental.dto.AdminDTO;

import java.util.ArrayList;

public interface AdminService {
    void saveAdmin(AdminDTO dto);
    void updateAdmin(AdminDTO dto);
    void deleteAdmin(String reg_ID);
    ArrayList<AdminDTO> getAllAdmin();
}
