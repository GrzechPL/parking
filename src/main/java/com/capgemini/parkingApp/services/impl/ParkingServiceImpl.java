package com.capgemini.parkingApp.services.impl;

import com.capgemini.parkingApp.dao.ParkingDao;
import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.entity.ParkingEntity;
import com.capgemini.parkingApp.mappers.ParkingMapper;
import com.capgemini.parkingApp.services.ParkingService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

import static java.time.LocalDate.now;

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
    public LocalDate getDate(){
        return LocalDate.now();
    }
    public LocalTime getTime(){

        LocalTime localTime = LocalTime.now();

        return localTime;
    }
}
