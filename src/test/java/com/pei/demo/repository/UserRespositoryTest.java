package com.pei.demo.repository;

import com.pei.demo.repository.database1.User1Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest

@RunWith(SpringRunner.class)
public class UserRespositoryTest {

    @Autowired
    User1Repository userRepository;

    @Test
    public void test1() {
        System.out.println(userRepository.findAll());
    }
}
