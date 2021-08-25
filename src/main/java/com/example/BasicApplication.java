package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.controller.ControladorPersona;

@SpringBootApplication
public class BasicApplication {

    public static void main(String[] args) {

        SpringApplication.run(BasicApplication.class, args);
    }

}
