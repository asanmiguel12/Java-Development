package com.pluralsight.FixedAssets;

public class Vehicle extends Asset {
    private int year;
    private int odometer;
    private String makeModel;

    public Vehicle(String makeModel, String description, int year, int odometer, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    @Override
    public double getValue() {
        this.year = 2024 - this.year;
        if (this.year <= 3 ) {
            this.originalCost *= .97;
        } else if (this.year <= 6) {
            this.originalCost *= .94;
        } else if (this.year <= 10) {
            this.originalCost *= .92;
        } else if (this.year > 10 && this.odometer > 100000 &&
                this.makeModel != "Honda" && this.makeModel != "Toyota") {
            this.originalCost = 1000 - (this.originalCost * .75) ;
        }
        return this.originalCost;
    }
}
