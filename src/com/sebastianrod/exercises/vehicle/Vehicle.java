package com.sebastianrod.exercises.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Methods{

    protected String brand;
    protected String model;
    protected String color;
    protected String speed;
    protected int releaseYear;

    protected static List<Vehicle> listVehicles = new ArrayList<>();

    public Vehicle(){

    }

    public Vehicle(String brand, String model, String color, String speed, int releaseYear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.releaseYear = releaseYear;

    }

    @Override
    public void add() {
        listVehicles.add(this);
    }

    @Override
    public void showAllForType() {
        String output = "";
        String type = this.getClass().getSimpleName();
        for (Vehicle v : listVehicles){
            String typeOfV = v.getClass().getSimpleName();
            if(typeOfV.equals("Car")){
                //System.out.println("a");
                output += v.details();
            } else{
                continue;
            }
            output += "\n";
        }

        System.out.println(output);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String details(){
        return String.format("%-10s | %-10s | %-10s | %-10s | %d",
                this.brand, this.model, this.color, this.speed, this.releaseYear);
    }

}
