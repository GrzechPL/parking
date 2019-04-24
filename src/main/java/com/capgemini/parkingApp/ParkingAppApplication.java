package com.capgemini.parkingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ParkingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkingAppApplication.class, args);
    }
}

//do deploymentu tylko
//public class ParkingAppApplication extends SpringBootServletInitializer {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(ParkingAppApplication.class);
//    }
//    public static void main(String[] args) {
//        SpringApplication.run(ParkingAppApplication.class, args);
//    }
//}
//end
