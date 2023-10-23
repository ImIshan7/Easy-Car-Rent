package lk.ijse.rental.entity;

import lk.ijse.rental.embeded.Name;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Customer {

    @Id
    private String user_Id;

    @Embedded
    private Name name;
    private String contact_No;
    private String address;
    private String email;
    private String nic;
    private String license_No;
    private String nic_Img;
    private String license_Img;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;
}
