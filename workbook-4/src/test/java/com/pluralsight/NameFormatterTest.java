package com.pluralsight;

import junit.framework.TestCase;

public class NameFormatterTest extends TestCase {

    public void testTestFormat() {
      String firstName = "Adrian";
      String lastName = "San Miguel";

      String fullName = NameFormatter.format(firstName, lastName);

      assertEquals("San Miguel, Adrian", fullName);
    }

    public void testTestFormat1() {
    }

    public void testTestFormat2() {
    }
}