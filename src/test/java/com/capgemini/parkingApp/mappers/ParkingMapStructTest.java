package com.capgemini.parkingApp.mappers;

import com.capgemini.parkingApp.dto.ParkingDto;
import com.capgemini.parkingApp.entity.ParkingEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingMapStructTest {

    @Autowired
    ParkingMapStruct parkingMapStruct;

    @Test
    public void shouldMapParkingToParkingDto() {
        //given
        ParkingEntity parkingEntity = new ParkingEntity(500);

        //when
        ParkingDto parkingDto = parkingMapStruct.parkingToParkingDto(parkingEntity);

        //then
        assertThat( parkingDto ).isNotNull();
        assertThat( parkingDto.getParkingPlace()).isEqualTo( 500 );
        }
}
