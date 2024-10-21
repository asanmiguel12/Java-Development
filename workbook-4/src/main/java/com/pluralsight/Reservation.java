package com.pluralsight;

public class Reservation {
    private String roomType;
    double price;
    int numberOfBeds ;
    boolean weekend;
    double reservationTotal;
    private double numberOfNights;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;

    }

    public double getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(double numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        double price = 139.00;
        if (roomType.equals("Queen")) {
            price = 124.00;
        }
        if(weekend) {
            price *= 1.1;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getReservationTotal() {
        double reservationTotal = getPrice() * numberOfNights;
        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
