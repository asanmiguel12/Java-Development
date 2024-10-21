package com.pluralsight;

public class App 
{
    public static void main( String[] args )
    {
        Reservation me = new Reservation("King", 1, true);
        System.out.println(me.getReservationTotal());
    }
}
