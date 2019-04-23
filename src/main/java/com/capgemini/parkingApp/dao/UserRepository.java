package com.capgemini.parkingApp.dao;


import com.capgemini.parkingApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    @Override
    <S extends User> S save(S s);
}