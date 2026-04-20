package dk.ponik.eventdemo.service;

import dk.ponik.eventdemo.model.Event;
import dk.ponik.eventdemo.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    private final List<Event> events = new ArrayList<>();
    private final EventRepository eventRepository;


    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }

    public Event getEventById(int id) {
        return eventRepository.findById(id).orElse(null);
    }
    public Event addEvent(Event event) {
        events.add(event);
        return event;
    }
    public Event updateEvent(int id, Event updatedEvent) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getId() == id) {
                events.set(i, updatedEvent);
                return updatedEvent;
            }
        }
            return null;
    }
    public void removeEvent(int id) {
        events.removeIf(event ->  event.getId() == id);
    }
}
