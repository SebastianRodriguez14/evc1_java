package com.sebastianrod.exercises.vehicle;

public class Car extends Vehicle {

    public boolean navigationSystem;

    public Car(){};

    public Car(String brand, String model, String color, String speed, int releaseYear, boolean navigationSystem) {
        super(brand, model, color, speed, releaseYear);
        this.navigationSystem = navigationSystem;
    }

    @Override
    public String details(){
        return String.format("%-10s | %-10s | %-10s | %-10s | %4d | %s",
                this.brand, this.model, this.color, this.speed, this.releaseYear, this.navigationSystem ? "With System Navigation" : "Without System Navigation");
    }



}
