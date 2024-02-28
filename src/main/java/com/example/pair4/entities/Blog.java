package com.example.pair4.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "blog_posts")
@Data
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "thumbnail")
    private String image;

    @Column(name = "excerpt", length = 10000)
    private String content;

    @Column(name = "publishDate")
    private LocalDateTime publishDate;

}
