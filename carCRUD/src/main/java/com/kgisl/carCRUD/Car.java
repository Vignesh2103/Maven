package com.kgisl.carCRUD;

public class Car {
    private int id;
    private String model;
    private String comany;
    private double price;
    public Car(int id, String model, String comany, double price) {
        this.id = id;
        this.model = model;
        this.comany = comany;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getComany() {
        return comany;
    }
    public void setComany(String comany) {
        this.comany = comany;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car [id=" + id + ", model=" + model + ", comany=" + comany + ", price=" + price + "]";
    }



    
}
