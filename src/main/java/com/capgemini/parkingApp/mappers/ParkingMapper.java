package com.capgemini.parkingApp.mappers;

import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.entity.ParkingEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ParkingMapper {

    public static ParkingDto toParkingDTO(ParkingEntity parkingEntity) {
        if (parkingEntity == null) {
            return null;
        }
        ParkingDto parkingDto = new ParkingDto();
        parkingDto.setId(parkingEntity.getId());
        parkingDto.setParkingPlace(parkingEntity.getParkingPlace());

        return parkingDto;
    }

    public static List<ParkingDto> toParkingListDTO(List<ParkingEntity> parkingEntity) {
        return parkingEntity.stream()
                .map(ParkingMapper::toParkingDTO)
                .collect(Collectors.toList());
    }
}