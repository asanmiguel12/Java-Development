package com.pluralsight;

public class HotelMain {
    public static void main( String[] args )
    {
        Reservation me = new Reservation("King", 1, true);
        System.out.println(me.getReservationTotal());

        Staff Adrian = new Staff(30, 50, "It", "Adrian", 10, 18);
        System.out.println(Adrian.getTotalPay());

        Rooms room1 = new Rooms(1, 139, false, false);
        String yesOrNo = room1.isAvailable ? "No" : "Yes";
        System.out.println(yesOrNo);

        Staff Gabe = new Staff(30, "It", "Gabe");
        Gabe.punchIn();
        Gabe.punchOut();
        Gabe.getPunchCard();
        Gabe.getHoursWorked();



    }
}
