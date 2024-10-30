package com.pluralsight.AssestManager;

public class Vehicle extends Asset{
    private int year;
    private int odometer;
    private String makeModel;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
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
        double value = 0;
        if (this.year <= 3 ) {
            value *= .97;
        } else if (this.year <= 6) {
            value *= .94;
        } else if (this.year <= 10) {
            value *= 92;
        } else if (this.year > 10 && this.odometer > 100000 &&
                this.makeModel != "Honda" ) {
            value = 1000 - (this.originalCost * .75) ;
        }
        return value;
    }
}
