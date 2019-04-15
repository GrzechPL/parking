package com.capgemini.parkingApp.controllers;

import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.dto.UserDto;
import com.capgemini.parkingApp.entity.UserEntity;
import com.capgemini.parkingApp.services.impl.ParkingServiceImpl;
import com.capgemini.parkingApp.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingRestController {

    @Autowired
    ParkingServiceImpl parkingServiceImpl;

//    @GetMapping(value = "/parking/{id}")
//    public ParkingDto getParkingById(@PathVariable("id") Long id) {
//        return parkingServiceImpl.getById(id);
//    }

    @GetMapping(value = "/parkingdata")
    public List<ParkingDto> getAllParking() {
        return parkingServiceImpl.getAllParking();
    }
}
