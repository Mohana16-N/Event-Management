package com.example.eventmanagement.model;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    // Constructors, Getters, and Setters
}
