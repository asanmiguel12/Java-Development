package com.pluralsight.FixedAssets;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, int squareFoot, int lotSize, int condition) {
        super(description, dateAcquired, originalCost);
        this.originalCost = originalCost;
        this.squareFoot = squareFoot;
        this.lotSize =  lotSize;
        this.condition = condition;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double value = 0;
        if (this.condition == 1) {
            value = this.squareFoot * 180 + (this.lotSize * .25) + this.originalCost;
        } else if (this.condition == 2) {
            value = this.squareFoot * 130 + (this.lotSize * .25) + this.originalCost;
        } else if (this.condition == 3) {
            value = this.squareFoot * 90 + (this.lotSize * .25) + this.originalCost;
        } else if (this.condition == 4) {
            value = this.squareFoot * 80 + this.originalCost;
        }
        return value;
    }

}
