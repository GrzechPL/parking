package com.capgemini.parkingApp.services;

import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.entity.ParkingEntity;

public interface ParkingService{

    ParkingDto getById(Long id);

}
