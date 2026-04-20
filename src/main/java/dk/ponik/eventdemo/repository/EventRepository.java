package dk.ponik.eventdemo.repository;

import dk.ponik.eventdemo.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Integer> {
}
