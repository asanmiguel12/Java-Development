package com.pluralsight.HotelApp;

import java.util.Scanner;

public class Hotel {
    String hotelName;
    String roomType;
    double numberOfRooms;
    double bookedSuites;
    double bookedBasicRooms;

    public Hotel(String hotelName, String roomType, double numberOfRooms, double bookedSuites, double bookedBasicRooms) {
        this.hotelName = hotelName;
        this.roomType = roomType;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public double getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public double getBookedSuites() {
        return bookedSuites;
    }

    public double getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getHotelName() {
        return hotelName;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {

    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {

    }

    public int bookRoom(int numberOfRooms, boolean isSuite) {
        numberOfRooms--;
        return numberOfRooms;

    }

    public void userInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of room would you like to book?");
        String userInput = scanner.nextLine();
    }

}