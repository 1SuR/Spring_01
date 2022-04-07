package com.example.spring_01;

import com.example.spring_01.pojo.Dog;
import com.example.spring_01.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring01ApplicationTests {

    @Autowired
    private Person dog;
    @Test
    void contextLoads() {
        System.out.println(dog);
    }

}
