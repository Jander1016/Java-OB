package com.poo.clases;

import com.poo.clases.Motor;

public class Vehicle {
    // Attributes
    String manufacturer;
    String model;
    double cc;
    int year;
    boolean sport;
    int speed;

    Motor motor;

    // Constructors

    public Vehicle() {
    }

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public Vehicle(String manufacturer, String model, double cc, int year, boolean sport, Motor motor) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed=0;
    }

    // Methods

    public void aceleration(int quantity) {
        this.speed += quantity;
    }

    // Getters and setters


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // ToString


    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
