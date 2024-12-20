package com.pluralsight.Interfaces.Animal;

public abstract class Animal {
    private String name;
    private String weight;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();
}
