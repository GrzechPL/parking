package com.capgemini.parkingApp.dao;


import com.capgemini.parkingApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>,UserRepositoryCustom {

    User findByEmail(String email);

    List<User> findByLastName(String lastname);

    @Override
    <S extends User> S save(S s);

    @Query
    List<User> withParameter(@Param("IDNUMBER") int idnumber);

    @Query
    List<User> moreThenThree();

    @Query("FROM User WHERE id = 3")
    User idThree();

    @Query(nativeQuery = true)
    List<User> lessThenThree();


}