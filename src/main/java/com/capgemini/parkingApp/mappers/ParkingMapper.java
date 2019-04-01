package com.capgemini.parkingApp.mappers;

import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.entity.ParkingEntity;

public class ParkingMapper {

    public static ParkingDto toParkingDTO(ParkingEntity parkingEntity) {
        if (parkingEntity == null)
        {
            return null;
        }
        ParkingDto parkingDto = new ParkingDto();
        parkingDto.setId(parkingEntity.getId());
        parkingDto.setParkingPlace(parkingEntity.getParkingPlace());

        return parkingDto;
    }

    public static ParkingEntity toParkingEntity(ParkingDto parkingDto) {
        if (parkingDto == null)
            return null;
        ParkingEntity parkingEntity = new ParkingEntity();
        parkingEntity.setParkingPlace(parkingDto.getParkingPlace());
        return parkingEntity;
    }

}