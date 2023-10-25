package lk.ijse.rental.repo;

import lk.ijse.rental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CarRepo extends JpaRepository<Car, String> {
    @Query(value = "SELECT car_Id FROM Car ORDER BY car_Id DESC LIMIT 1", nativeQuery = true)
    String getLastIndex();

    @Query(value = "SELECT COUNT(car_Id) FROM Car", nativeQuery = true)
    int getSumCar();


}
