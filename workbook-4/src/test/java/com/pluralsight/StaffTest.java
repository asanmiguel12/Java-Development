package com.pluralsight;

import com.pluralsight.HotelApp.Staff;
import junit.framework.TestCase;

public class StaffTest extends TestCase {

    public void testPunchInAndOut() {
        Staff Adrian = new Staff(50, "IT", "Adrian");
        Adrian.punchIn();

        Adrian.punchOut();


    }
}