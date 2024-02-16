package com.example.pair4.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "requirements")
@Data
public class Requirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "min_age")
    private int minAge;

    @Column(name = "min_license")
    private int minLicense;

    @Column(name = "min_card")
    private int minCredit;

    @Column(name = "rating")
    private double rate;

    @Column(name = "review")
    private double review;

    @OneToMany(mappedBy = "requirement")
    @JsonIgnore
    private List<Car> cars;



}
