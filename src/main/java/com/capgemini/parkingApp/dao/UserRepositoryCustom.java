package com.capgemini.parkingApp.dao;

import com.capgemini.parkingApp.entity.User;

import java.util.List;

public interface UserRepositoryCustom {

    List<User> orderByLastName();

}
