package dk.ponik.eventdemo.service;

import dk.ponik.eventdemo.model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    private final List<Event> events = new ArrayList<>();


    public EventService() {
        events.add(new Event(1, "Cooking class", "Esbjerg", 50.0));
        events.add(new Event(2, "Football match", "Copenhagen", 70.0));
    }

    public List<Event> getAllEvents() {
        return events;
    }

    public Event getEventById(int id) {
        return events.stream().
                filter(event -> event.Id() == id).findFirst().orElse(null);
    }
    public Event addEvent(Event event) {
        events.add(event);
        return event;
    }
    public Event updateEvent(int id, Event updatedEvent) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).Id() == id) {
                events.set(i, updatedEvent);
                return updatedEvent;
            }
        }
            return null;
    }
    public void removeEvent(int id) {
        events.removeIf(event ->  event.Id() == id);
    }
}
