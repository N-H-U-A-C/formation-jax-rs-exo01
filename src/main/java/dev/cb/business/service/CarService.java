package dev.cb.business.service;

import dev.cb.business.domain.Car;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarService {

    private List<Car> cars = new ArrayList<>();
    private int count = 0;

    public CarService() {
        cars.add(new Car(++count, "Toyota", "Prius", 2010, "Pink"));
        cars.add(new Car(++count, "Renault", "Twingo", 2005, "White"));
        cars.add(new Car(++count, "Citroën", "Picasso", 2009, "Black"));
        cars.add(new Car(++count, "Peugeot", "106 Kid", 1995, "Red"));
        cars.add(new Car(++count, "AM General", "Hummer H1", 2004, "Green"));
    }

    public Car create(Car car) {
        car.setId(++count);
        cars.add(car);
        return car;
    }

    public List<Car> getAll() {
        return cars;
    }

    public Car getById(long id) {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
    }

    public Car update(long id, Car updatedCar) {
        Car car = getById(id);
        car.setBrand(updatedCar.getBrand());
        car.setModel(updatedCar.getModel());
        car.setProductionDate(updatedCar.getProductionDate());
        car.setColor(updatedCar.getColor());
        return car;
    }

    public boolean delete(long id) {
        return cars.removeIf(car -> car.getId() == id);
    }
}
