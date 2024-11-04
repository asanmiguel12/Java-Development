package com.pluralsight.Finance;

public class Gold extends FixedAsset{
    private double weight;


    public Gold(String name, double marketValue, double weight) {
        super(marketValue, );
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return weight * 200;
    }
}
