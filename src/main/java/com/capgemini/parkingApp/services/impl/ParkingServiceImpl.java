package com.capgemini.parkingApp.services.impl;

import com.capgemini.parkingApp.dao.ParkingDao;
import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.entity.ParkingEntity;
import com.capgemini.parkingApp.mappers.ParkingMapper;
import com.capgemini.parkingApp.services.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {

    @Autowired
    private ParkingDao parkingDao;

    @Override
    public ParkingDto getById(Long id) {
        ParkingEntity byId = parkingDao.getOne(id);
        return ParkingMapper.toParkingDTO(byId);
    }
    @Override
    public List<ParkingDto> getAllParking() {
        List<ParkingEntity> byAll = parkingDao.findAll();
        return ParkingMapper.toParkingListDTO(byAll);
    }
    public String getDateAndTime(){

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu HH:mm:ss");

        String formatDateTime = now.format(formatter);

        return formatDateTime;

    }
}
