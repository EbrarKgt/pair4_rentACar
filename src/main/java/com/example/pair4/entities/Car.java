package com.example.pair4.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cars")
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

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @OneToMany(mappedBy = "car")
    @JsonIgnore
    private List<Rental> rentals;
}
