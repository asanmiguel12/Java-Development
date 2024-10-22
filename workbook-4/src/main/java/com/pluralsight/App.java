package com.pluralsight;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        Reservation me = new Reservation("King", 1, true);
        System.out.println(me.getReservationTotal());

        Staff Adrian = new Staff(30, 50, "It", "Adrian");
        System.out.println(Adrian.getTotalPay());
    }
}
