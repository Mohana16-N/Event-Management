package com.example.eventmanagement.service;

import com.example.eventmanagement.dto.EventDTO;
import com.example.eventmanagement.exception.ResourceNotFoundException;
import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public EventDTO createEvent(EventDTO eventDTO) {
        Event event = new Event(eventDTO.getName(), eventDTO.getDescription());
        Event savedEvent = eventRepository.save(event);
        return new EventDTO(savedEvent.getId(), savedEvent.getName(), savedEvent.getDescription());
    }

    @Override
    public EventDTO getEventById(Long id) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found with id: " + id));
        return new EventDTO(event.getId(), event.getName(), event.getDescription());
    }

    @Override
    public List<EventDTO> getAllEvents() {
        return eventRepository.findAll().stream()
                .map(event -> new EventDTO(event.getId(), event.getName(), event.getDescription()))
                .collect(Collectors.toList());
    }
}
