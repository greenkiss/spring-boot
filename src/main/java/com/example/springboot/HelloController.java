package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired
    PersonMapper personMapper;

    @RequestMapping("/")
    public Person index() {

        return personMapper.selectPerson(1);
    }

}