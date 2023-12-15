package com.example.pair4.repositories;

import com.example.pair4.entities.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Integer> {
    boolean existsColorByName(String name);


}