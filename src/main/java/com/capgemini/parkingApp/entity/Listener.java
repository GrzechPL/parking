package com.capgemini.parkingApp.entity;

import javax.persistence.PrePersist;
import java.util.Random;

public class  Listener {

@PrePersist
public void generateRandomNumber(User user) {
    Random gen = new Random();
    int liczba = gen.nextInt(100)+1;
    user.setPozycja(liczba);
}
}