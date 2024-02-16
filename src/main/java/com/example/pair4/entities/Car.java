package com.example.pair4.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "cars")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "kilometer")
    private int kilometer;

    @Column(name = "plate")
    private String plate;

    @Column(name = "year")
    private int year;

    @Column(name = "daily_price")
    private double dailyPrice;

    @Column(name = "image")
    private String image;

    @Column(name = "logo")
    private String logo;

    @Column(name= "seat")
    private int seat;

    @Column(name = "luggage")
    private int luggage;

    @Column(name= "fuel")
    private String fuel;

    @Column(name= "gear")
    private String gear;



    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "requirement_id")
    private Requirement requirement;

    @OneToMany(mappedBy = "car")
    @JsonIgnore
    private List<Rental> rentals;
}
