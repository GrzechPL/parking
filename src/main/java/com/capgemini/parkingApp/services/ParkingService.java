package com.capgemini.parkingApp.services;

import com.capgemini.parkingApp.dto.ParkingDto;

import java.util.List;

public interface ParkingService {
    ParkingDto getById(Long id);
    List<ParkingDto> getAllParking();
}
