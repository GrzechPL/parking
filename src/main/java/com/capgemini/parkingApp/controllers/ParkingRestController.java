package com.capgemini.parkingApp.controllers;

import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.services.impl.ParkingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingRestController {

    @Autowired
    ParkingServiceImpl userServiceImpl;

    @GetMapping(value = "/parking/{id}")
    public ParkingDto getParkingById(@PathVariable("id") Long id) {
        return userServiceImpl.getById(id);
    }

    @GetMapping(value = "/parkingdata")
    public List<ParkingDto> getParkingById() {
        return userServiceImpl.getAll();
    }

}
