package com.capgemini.parkingApp;

import com.capgemini.parkingApp.mappers.ParkingMapStruct;
import com.capgemini.parkingApp.mappers.ParkingMapStructTest;
import com.capgemini.parkingApp.services.UserServiceTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Suite.class)
@Suite.SuiteClasses({
      ParkingMapStructTest.class,
      UserServiceTest.class
})
public class SuiteTests {
}
