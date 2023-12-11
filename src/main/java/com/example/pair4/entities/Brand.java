package com.example.pair4.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

//GETTER SETTER HENÜZ EKLENMEDİ
@Table(name = "brands")
@Entity
public class Brand {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand") // join edilen sınıfta kendi oluşturduğumuz nesnenin ismi (model classı row = 19)
    @JsonIgnore
    private List<Model> models;
}
