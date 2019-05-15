package com.capgemini.parkingApp.singleMetodsTests;

import com.capgemini.parkingApp.entity.User;
import com.capgemini.parkingApp.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingleTest {

    @Autowired
    UserService userService;

    @Test
    public void findUserByLastNameTest() {
        //given
        String lastName = "Lastowski";

        //when
        List<User> results = userService.findUserByLastName(lastName);

        //then
        assertEquals("grzech78@o2.pl", results.get(0).getEmail());
    }
    @Test
    public void moreThenThree() {
        //given

        //when
        List<User> results = userService.moreThenThree();

        //then
        assertEquals(2, results.size());
    }
    @Test
    public void lessThenThree() {
        //given

        //when
        List<User> results = userService.lessThenThree();

        //then
        assertEquals(2, results.size());
    }

    @Test
    public void withParameter() {
        //given
        int par = 1;

        //when
        List<User> results = userService.withParameter(par);

        //then
        assertEquals(4, results.size());
    }

    @Test
    public void idThree() {
        //given

        //when
        User results = userService.idThree();

        //then
        assertEquals("qwe", results.getName());
    }

    @Test
    public void QueryDslTest() {
        //given

        //when
        List<User> results = userService.QueryDsl();

        //then
        assertEquals(4, results.size());
    }
}
