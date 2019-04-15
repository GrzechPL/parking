package com.capgemini.parkingApp.services.impl;

import com.capgemini.parkingApp.dao.UserCrudDao;
import com.capgemini.parkingApp.dto.UserDto;
import com.capgemini.parkingApp.entity.UserEntity;
import com.capgemini.parkingApp.mappers.UsersMapper;
import com.capgemini.parkingApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserCrudDao userDao;

    @Override
    public void saveUser(UserDto newUser) {
       userDao.save(UsersMapper.toUserEntity(newUser));
    }

    public List<UserDto> getAllUsers() {
        List<UserEntity> byAllUser = userDao.findAll();
        return UsersMapper.toUserListDTO(byAllUser);
    }
}
