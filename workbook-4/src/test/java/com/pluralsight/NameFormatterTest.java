package com.pluralsight;

import junit.framework.TestCase;

public class NameFormatterTest extends TestCase {

    public void testTestFormat() {
      String firstName = "Adrian";
      String lastName = "San Miguel";

      String formattedName = NameFormatter.format(firstName, lastName);

      assertEquals("San Miguel, Adrian", formattedName);
    }

    public void testTestFormat1() {
        String prefix = "Mr.";
        String firstName = "Adrian";
        String middleName = "Christian";
        String lastName = "San Miguel";
        String suffix = "The 1st";

        String formattedName = NameFormatter.format(prefix,firstName, middleName, lastName, suffix);

        assertEquals("San Miguel, Mr. Adrian Christian, The 1st", formattedName);
    }

    public void testTestFormat2() {
    }
}