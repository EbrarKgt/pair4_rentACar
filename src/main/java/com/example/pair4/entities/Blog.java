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

    @Column(name = "content", length = 10000)
    private String content;

    @Column(name = "publish_date")
    private LocalDateTime publishDate;

    @Column(name = "image")
    private String image;


}
