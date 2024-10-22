package com.pluralsight;

import java.util.Arrays;

public class App {
    public static void main( String[] args )
    {
        Reservation me = new Reservation("King", 1, true);
        System.out.println(me.getReservationTotal());

        Staff Adrian = new Staff(30, 50, "It", "Adrian", 10, 18);
        System.out.println(Adrian.getTotalPay());

        Rooms rooms = new Rooms(1, 139, false, false);
        String yesOrNo = rooms.isAvailable ? "No" : "Yes";
        System.out.println(yesOrNo);

        System.out.println(Adrian.getPunchCard());

    }
}
