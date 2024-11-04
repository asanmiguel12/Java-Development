package com.pluralsight.Finance;

public class Jewelery extends FixedAsset implements Valuable{
    private double karat;

    public Jewelery(String name, double marketValue, double karat) {
        super(name, );
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }


    @Override
    public double getValue() {
        return karat * 20;
    }
}
