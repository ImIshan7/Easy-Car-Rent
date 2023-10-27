package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.UserDTO;
import lk.ijse.rental.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public ArrayList<UserDTO> getAllRegUsers() {
        return null;
    }

    @Override
    public UserDTO getRegUsers(String username, String password) {
        return null;
    }
}
