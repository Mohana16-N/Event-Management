package com.example.eventmanagement.service;

import com.example.eventmanagement.dto.ReviewDTO;
import com.example.eventmanagement.exception.ResourceNotFoundException;
import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.model.Review;
import com.example.eventmanagement.repository.EventRepository;
import com.example.eventmanagement.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private EventRepository eventRepository;

    @Override
    public ReviewDTO addReview(Long eventId, ReviewDTO reviewDTO) {
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found with id: " + eventId));

        Review review = new Review(reviewDTO.getComment(), reviewDTO.getRating(), event);
        Review savedReview = reviewRepository.save(review);
        return new ReviewDTO(savedReview.getId(), savedReview.getComment(), savedReview.getRating());
    }

    @Override
    public List<ReviewDTO> getReviewsByEvent(Long eventId) {
        return reviewRepository.findByEventId(eventId).stream()
                .map(review -> new ReviewDTO(review.getId(), review.getComment(), review.getRating()))
                .collect(Collectors.toList());
    }
}
