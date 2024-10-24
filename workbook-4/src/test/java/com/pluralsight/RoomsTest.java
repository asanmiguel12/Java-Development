package com.pluralsight;

import com.pluralsight.HotelApp.Rooms;
import junit.framework.TestCase;

public class RoomsTest extends TestCase {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    public boolean isAvailable;
    public boolean checkIn;
    public boolean checkOut;
    public boolean needToCleanRoom;


    public void testIsCheckIn() {
        //room should be occupied and dirty
        //arrange
        Rooms rooms = new Rooms(5, 50);
        //act
        rooms.isCheckIn();
        //assert
        assertFalse(rooms.isDirty() && rooms.isOccupied());
    }

    public void testIsCheckOut() {
        //room needs to be cleaned and marked available and is not occupied
        //arrange
        Rooms rooms = new Rooms(5, 50);
        //act
        rooms.isCheckOut();
        //assert
        assertTrue(rooms.isAvailable());
        assertFalse(rooms.isOccupied());
        assertTrue(rooms.isDirty());
    }

}
