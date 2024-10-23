package com.pluralsight;

public class Rooms {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    public boolean isAvailable;
    public boolean checkIn;
    public boolean checkOut;
    public boolean needToCleanRoom;

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
        return needToCleanRoom;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isNeedToCleanRoom() {
        if (true) {
            return !isDirty;
        }
        return false;
    }

    public void setNeedToCleanRoom(boolean needToCleanRoom) {
        this.needToCleanRoom = needToCleanRoom;
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
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return needToCleanRoom;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
       if (true) {
           return !isDirty && !isOccupied;
       }
       return isDirty && isOccupied;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
