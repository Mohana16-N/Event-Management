package com.example.eventmanagement.controller;

import com.example.eventmanagement.dto.ReviewDTO;
import com.example.eventmanagement.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/{eventId}")
    public ResponseEntity<ReviewDTO> addReview(@PathVariable Long eventId, @RequestBody ReviewDTO reviewDTO) {
        return ResponseEntity.ok(reviewService.addReview(eventId, reviewDTO));
    }

    @GetMapping("/{eventId}")
    public ResponseEntity<List<ReviewDTO>> getReviewsByEvent(@PathVariable Long eventId) {
        return ResponseEntity.ok(reviewService.getReviewsByEvent(eventId));
    }
}
