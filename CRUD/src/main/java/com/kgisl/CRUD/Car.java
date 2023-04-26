package com.kgisl.CRUD;

public class Car {
    private int id;
    private String name;
    private Float prize;

    public Car(int id, String name, Float prize) {
        this.id = id;
        this.name = name;
        this.prize = prize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrize() {
        return prize;
    }

    public void setPrize(Float prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Car id=" + id + ", name=" + name + ", prize=" + prize;
    }

}
