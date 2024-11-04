package com.pluralsight.Finance;

public class Jewelery extends Asset{
    private String name;
    private double karat;

    public Jewelery(String description, String dateAcquired, double originalCost, String name, double karat) {
        super(description, dateAcquired, originalCost);
        this.name = name;
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
