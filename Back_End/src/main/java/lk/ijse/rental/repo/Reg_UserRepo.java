package lk.ijse.rental.repo;

import lk.ijse.rental.entity.Reg_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Reg_UserRepo extends JpaRepository<Reg_User, String> {
}
