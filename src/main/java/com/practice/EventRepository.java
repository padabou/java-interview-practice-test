package com.practice;

import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface EventRepository extends Repository<Event, Long> {

    void delete(Long eventId);

    Event findById(Long eventId);
}
