package com.capgemini.parkingApp.dto;

public class ParkingDto {

    private Long id;
    private int parkingPlace;

    public ParkingDto(Long id, int parkingPlace) {
        this.id = id;
        this.parkingPlace = parkingPlace;
    }
    public ParkingDto() {

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
