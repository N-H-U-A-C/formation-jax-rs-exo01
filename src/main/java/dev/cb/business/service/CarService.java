package dev.cb.business.service;

import dev.cb.business.model.Car;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarService {

    public List<Car> getAll() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Toyota", "Prius", 2010, "Pink"));
        cars.add(new Car("Renault", "Twingo", 2005, "White"));
        cars.add(new Car("Citroën", "Picasso", 2009, "Black"));
        return cars;
    }

    public Car getById(int id) {
        return new Car("Renault", "Twingo", 2005, "White");
    }
}
