package dev.cb.business.model;

public class Car {

    private long id;
    private String brand;
    private String model;
    private int productionDate;
    private String color;

    public Car() {
    }

    public Car(String brand, String model, int productionDate, String color) {
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public String getColor() {
        return color;
    }
}
