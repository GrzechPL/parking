package com.capgemini.parkingApp.dao;

import com.capgemini.parkingApp.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserCrudDao extends CrudRepository <UserEntity,Long> {

    @Override
    <S extends UserEntity> S save(S s);

    @Override
    List<UserEntity> findAll();
}
