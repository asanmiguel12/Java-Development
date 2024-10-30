package com.pluralsight.AssestManager;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
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
    public void getValue(double originalCost) {
        if (this.condition == 1 ) {
            this.originalCost = this.squareFoot * 180 + (this.lotSize * .25);
        } else if (this.condition == 2) {
            this.originalCost = this.squareFoot * 130 + (this.lotSize * .25);
        } else if (this.condition == 3) {
            this.originalCost = this.squareFoot * 90 + (this.lotSize * .25);
        } else if (this.condition == 4) {
            this.originalCost = this.squareFoot * 80 + (this.lotSize * .25);
            System.out.println("Your house is currently worth " + this.originalCost);
        }

    }
}
