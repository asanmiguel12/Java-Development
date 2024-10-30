package com.pluralsight.AssestManager;

public class Vehicle extends Asset{
    private int year;
    private int odometer;
    private String makeModel;

    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
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
    public void getValue(double value) {
        if (this.year <= 3 ) {
            this.originalCost *= .97;
        } else if (this.year <= 6) {
            this.originalCost *= .94;
        } else if (this.year <= 10) {
            this.originalCost *= 92;
        } else if (this.year > 10 && this.odometer > 100000 &&
                this.makeModel != "Honda" ) {
            this.originalCost = 1000 - (this.originalCost * .75) ;
        }

    }
}
