package com.example.eventmanagement.service;

import com.example.eventmanagement.dto.EventDTO;

import java.util.List;

public interface EventService {
    EventDTO createEvent(EventDTO eventDTO);
    EventDTO getEventById(Long id);
    List<EventDTO> getAllEvents();
}
