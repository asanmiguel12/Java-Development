package com.pluralsight.Finance;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public FixedAsset(double marketValue, String name) {
        this.marketValue = marketValue;
        this.name = name;
    }

    public abstract void getValue();
}
