package dev.cb.business.domain;

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

    public Car(long id, String brand, String model, int productionDate, String color) {
        this(brand, model, productionDate, color);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
