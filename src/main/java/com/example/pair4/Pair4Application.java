package com.example.pair4;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// GITHUB DENEME SATIRI

@SpringBootApplication
public class Pair4Application {

    public static void main(String[] args) {
        SpringApplication.run(Pair4Application.class, args);
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
