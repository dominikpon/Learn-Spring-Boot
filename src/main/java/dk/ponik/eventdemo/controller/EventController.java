package dk.ponik.eventdemo.controller;


import dk.ponik.eventdemo.model.Event;
import dk.ponik.eventdemo.service.EventService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Event getSingleEvent(@PathVariable int id) {
        return eventService.getEventById(id);
    }

    @PostMapping
    public Event addEvent(@Valid @RequestBody Event event) {
        eventService.addEvent(event);
        return event;
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable int id, @Valid @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }


    @DeleteMapping ("/{id}")
    public void deleteEvent(@PathVariable int id, @Valid @RequestBody Event event) {
        eventService.removeEvent(id);
    }
}
