package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEvents() {
        return Collections.emptyList();
    }

    public void delete(Long id) {
        eventRepository.delete(id);
    }

    public void updateStars(Long eventId, Event event) {
        Event persistedEvent = eventRepository.findById(eventId);
    }
}
