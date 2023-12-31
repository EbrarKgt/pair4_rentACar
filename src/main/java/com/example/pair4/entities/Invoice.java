package com.example.pair4.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "invoices")
@Data
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn(name = "rental_id")
    private Rental rental;
}
