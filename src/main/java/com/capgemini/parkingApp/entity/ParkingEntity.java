package com.capgemini.parkingApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="Parking")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ParkingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "parkingPlace", nullable = false)
    private int parkingPlace;

    public ParkingEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(int parkingPlace) {
        this.parkingPlace = parkingPlace;
    }
}
