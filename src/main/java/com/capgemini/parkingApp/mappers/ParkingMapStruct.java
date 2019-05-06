package com.capgemini.parkingApp.mappers;

import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.entity.ParkingEntity;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ParkingMapStruct {
    ParkingDto parkingToParkingDto(ParkingEntity parkingEntity);
    List<ParkingDto> parkingToParkingDtoList(List<ParkingEntity> parkingEntity);
}
