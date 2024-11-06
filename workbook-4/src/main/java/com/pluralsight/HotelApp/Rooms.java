package com.pluralsight.HotelApp;

public class Rooms {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    public boolean isAvailable;
    public boolean checkIn;
    public boolean checkOut;;

    public Rooms(double price, int numberOfBeds) {
        this.price = price;
        this.numberOfBeds = numberOfBeds;

    }

    public boolean isCheckIn() {
        return !isAvailable && !isDirty;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public boolean isCheckOut() {
        cleanRoom();
        return !isOccupied && !isAvailable;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public void cleanRoom() {
        if (isOccupied) {
            isDirty = false;
            System.out.println("Currently Occupied");
        } else {
            isDirty = false;
        }

    }

    public Rooms (int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isDirty = isDirty;
        this.isOccupied= isOccupied;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return true;

    }

    public void setOccupied(boolean occupied) {
        isOccupied = isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
