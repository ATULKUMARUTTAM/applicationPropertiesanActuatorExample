package com.atuluttam.applicationPropertiesExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class StudentController {
    @Autowired
    Student st;

    @GetMapping("/info")
    public Student display()
    {
        return st;
    }

    @GetMapping("/greet")
    public String message()
    {
        return "Welcome to SpringBoot Actuator";
    }
}
