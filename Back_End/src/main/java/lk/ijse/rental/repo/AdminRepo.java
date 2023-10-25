package lk.ijse.rental.repo;

import lk.ijse.rental.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, String> {
}
