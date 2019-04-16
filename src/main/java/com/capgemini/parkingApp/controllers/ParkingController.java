package com.capgemini.parkingApp.controllers;

import com.capgemini.parkingApp.services.impl.ParkingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParkingController {

    @Autowired
    ParkingServiceImpl parkingServiceImpl;

    @GetMapping(value="/home")
    public String getAllUser(Model model){
        model.addAttribute("parkingList",parkingServiceImpl.getAllParking());
        model.addAttribute("parkingData",parkingServiceImpl.getDate());
        model.addAttribute("parkingTime",parkingServiceImpl.getTime());
        return "parking";
    }
}
