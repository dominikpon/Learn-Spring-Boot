package dk.ponik.eventdemo.config;

import dk.ponik.eventdemo.model.Event;
import dk.ponik.eventdemo.repository.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner initDatabase(EventRepository repository) {
        return args -> {
            repository.save(new Event(0, "Big Tech Fest", "Esbjerg", 100));
            repository.save(new Event(1, "Java Night", "Copenhagen", 200));
            System.out.println("Data has been seeded with inital events");
        };
    }
}
