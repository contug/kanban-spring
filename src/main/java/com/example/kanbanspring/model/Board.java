package com.example.kanbanspring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;



}
