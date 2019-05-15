package com.capgemini.parkingApp.services;

import com.capgemini.parkingApp.dao.RoleRepository;
import com.capgemini.parkingApp.dao.UserRepository;
import com.capgemini.parkingApp.entity.Role;
import com.capgemini.parkingApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service("userService")
public class UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository,
                       RoleRepository roleRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public List<User> findUserByLastName(String lastname) {
        return userRepository.findByLastName(lastname);
    }

    public List<User> QueryDsl() {
        return userRepository.orderByLastName();
    }

    public List<User> moreThenThree() {
        return userRepository.moreThenThree();
    }

    public User idThree() {
        return userRepository.idThree();
    }

    public List<User> withParameter(int par) {
        return userRepository.withParameter(par);
    }

    public List<User> lessThenThree() {
        return userRepository.lessThenThree();
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        return userRepository.save(user);
    }

}
