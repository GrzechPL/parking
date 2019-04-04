package com.capgemini.parkingApp.services;

import com.capgemini.parkingApp.dto.ParkingDto;

public interface ParkingService {
    ParkingDto getById(Long id);
}
