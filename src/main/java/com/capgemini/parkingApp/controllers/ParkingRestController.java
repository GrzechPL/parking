package com.capgemini.parkingApp.controllers;

import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.services.impl.ParkingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingRestController {

    @Autowired
    ParkingServiceImpl parkingServiceImpl;

    @GetMapping(value = "/parkingdata")
    public List<ParkingDto> getAllParking() {
        return parkingServiceImpl.getAllParking();
    }
}
