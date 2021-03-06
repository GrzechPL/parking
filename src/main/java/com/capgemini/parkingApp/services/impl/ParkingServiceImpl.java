package com.capgemini.parkingApp.services.impl;

import com.capgemini.parkingApp.dao.ParkingDao;
import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.entity.ParkingEntity;
import com.capgemini.parkingApp.entity.User;
import com.capgemini.parkingApp.mappers.ParkingMapStruct;
import com.capgemini.parkingApp.mappers.ParkingMapper;
import com.capgemini.parkingApp.services.ParkingService;
import com.capgemini.parkingApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService  {

    @Autowired
    private ParkingDao parkingDao;

    @Autowired
    UserService userService;

    @Autowired
    ParkingMapStruct parkingMapStruct;

    @Override
    public ParkingDto getById(Long id) {
        ParkingEntity byId = parkingDao.getOne(id);
        return parkingMapStruct.parkingToParkingDto(byId);
    }

    @Override
    public List<ParkingDto> getAllParking() {
        List<ParkingEntity> byAll = parkingDao.findAll();
        return parkingMapStruct.parkingToParkingDtoList(byAll);
    }

    public String getDateAndTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu HH:mm:ss");
        String formatDateTime = now.format(formatter);
        return formatDateTime;

    }

    public String getWelcomeMessage() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        String userName = "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")";
        return userName;
    }
}
