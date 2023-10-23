/*
package lk.ijse.rental.entity;

import lk.ijse.rental.embeded.Rate;
import lk.ijse.rental.enums.AvailabilityType;
import lk.ijse.rental.enums.CarType;
import lk.ijse.rental.enums.FuelType;
import lk.ijse.rental.enums.TransmissionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.awt.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {
    @Id
    private String car_Id;
    private String name;
    private String brand;
    @Enumerated(EnumType.STRING)
    private CarType type;
    @Embedded
    private Image image;
    private int number_Of_Passengers;
    @Enumerated(EnumType.STRING)
    private TransmissionType transmission_Type;
    @Enumerated(EnumType.STRING)
    private FuelType fuel_Type;
    @Embedded
    private Rate rent_Duration_Price;
    private double price_Extra_KM;
    private String registration_Number;
    private double free_Mileage;
    private String color;
    @Enumerated(EnumType.STRING)
    private AvailabilityType vehicleAvailabilityType;

}
*/
