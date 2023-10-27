package lk.ijse.rental.service.impl;

import lk.ijse.rental.dto.UserDTO;
import lk.ijse.rental.repo.UserRepo;
import lk.ijse.rental.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private ModelMapper mapper;



    @Override
    public ArrayList<UserDTO> getAllRegUsers() {

        return mapper.map(repo.findAll(), new TypeToken<ArrayList<UserDTO>>() {
        }.getType());
    }

    @Override
    public UserDTO getRegUsers(String username, String password) {
        return null;
    }
}
