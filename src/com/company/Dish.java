package com.company;

public class Dish implements Item{
    private double s;
    private String name;
    private String description;
    Dish(String n, String d){
        this.name=n;
        this.description=d;
        this.s=0;
    }
    Dish(double s, String n, String d){
        this.name=n;
        this.description=d;
        this.s=s;
    }

    public double getS() {
        return s;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
