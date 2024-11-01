package com.pluralsight.AssestManagerAbstract;

import com.pluralsight.AssestManager.Asset;

public class Cash extends Asset {
    private double cash;

    public Cash(String description, String dateAcquired, double originalCost, double cash) {
        super(description, dateAcquired, originalCost);
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getValue(){

      return getOriginalCost();
    }
}
