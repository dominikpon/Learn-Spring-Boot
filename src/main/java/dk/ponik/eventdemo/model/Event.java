package dk.ponik.eventdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 to 50 characters.")
    private String name;

    @NotBlank(message = "Location is required")
    private String location;

    @Positive(message = "Price cannot be negative")
    private double price;

    public Event() {}

    public Event(int id, String name, String location, double price) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public String getLocation() {return location;}
    public double getPrice() {return price;}

}
