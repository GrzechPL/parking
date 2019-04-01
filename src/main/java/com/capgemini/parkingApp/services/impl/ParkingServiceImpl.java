package com.capgemini.parkingApp.services.impl;

import com.capgemini.parkingApp.dao.ParkingDao;
import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.entity.ParkingEntity;
import com.capgemini.parkingApp.mappers.ParkingMapper;
import com.capgemini.parkingApp.services.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParkingServiceImpl implements ParkingService {

    @Autowired
    private ParkingDao parkingDao;

    @Override
    public ParkingDto getById(Long id){

        ParkingEntity byId = parkingDao.getOne(id);

        return ParkingMapper.toParkingDTO(byId);
    }


}
