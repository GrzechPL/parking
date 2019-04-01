package com.capgemini.parkingApp.controllers;

import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.entity.ParkingEntity;
import com.capgemini.parkingApp.services.impl.ParkingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingRestController {

    @Autowired
    ParkingServiceImpl userServiceImpl;

    @GetMapping(value = "/parking/{id}")
    public ParkingDto getParkingById(@PathVariable("id") Long id) {
       return  userServiceImpl.getById(id);
    }

}
