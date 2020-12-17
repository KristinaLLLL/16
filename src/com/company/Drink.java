package com.company;

final class Drink implements Item{
    private double s;
    private String name;
    private String description;
    Drink(String n, String d){
        this.name=n;
        this.description=d;
        this.s=0;
    }
    Drink(double s, String n, String d){
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
