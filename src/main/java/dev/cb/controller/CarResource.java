package dev.cb.controller;

import dev.cb.business.domain.Car;
import dev.cb.business.service.CarService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarResource {

    private final CarService carService;

    @Inject
    public CarResource(CarService carService) {
        this.carService = carService;
    }

    @POST // http://localhost:8080/formation_jax_rs_exo01_war_exploded/cars
    @Consumes(MediaType.APPLICATION_JSON)
    public Car createCar(Car car) {
        return carService.create(car);
    }

    @GET // http://localhost:8080/formation_jax_rs_exo01_war_exploded/cars
    public List<Car> getAll() {
        return carService.getAll();
    }

    @GET // http://localhost:8080/formation_jax_rs_exo01_war_exploded/cars/1
    @Path("{id}")
    public Car getById(@PathParam("id") long id) {
        return carService.getById(id);
    }

    @PUT // http://localhost:8080/formation_jax_rs_exo01_war_exploded/cars/1
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Car update(@PathParam("id") long id, Car car) {
        return carService.update(id, car);
    }

    @DELETE // http://localhost:8080/formation_jax_rs_exo01_war_exploded/cars/1
    @Path("{id}")
    public boolean delete(@PathParam("id") long id) {
        return carService.delete(id);
    }
}