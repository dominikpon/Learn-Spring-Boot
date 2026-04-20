package dk.ponik.eventdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
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
