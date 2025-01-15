package com.example.eventmanagement.service;

import com.example.eventmanagement.dto.ReviewDTO;

import java.util.List;

public interface ReviewService {
    ReviewDTO addReview(Long eventId, ReviewDTO reviewDTO);
    List<ReviewDTO> getReviewsByEvent(Long eventId);
}
