package dev.cb.controller;

import dev.cb.business.model.Car;
import dev.cb.business.service.CarService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
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

    @GET
    public List<Car> getAll() {
        return carService.getAll();
    }

    @GET
    @Path("{id}")
    public Car getById(@PathParam("id") int id) {
        return carService.getById(id);
    }

    @GET
    @Path("/test")
    @Produces("text/plain")
    public String test() {
        return "OK";
    }
}