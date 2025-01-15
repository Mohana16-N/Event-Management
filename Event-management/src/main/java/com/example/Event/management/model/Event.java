package com.example.eventmanagement.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    // Constructors, Getters, and Setters
}
