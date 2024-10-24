package com.pluralsight;

import java.util.Arrays;

public class NameFormatter {
    private String prefix;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

//    private NameFormatter(String prefix, String firstName, String middleName, String lastName, String suffix) {
//        this.prefix = prefix;
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.suffix = suffix;

    private NameFormatter(){}


    public static String format(String firstName, String lastName) {
        String formattedName = lastName + ", " + firstName;
        System.out.println(lastName + ", " + firstName);
        return formattedName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        String formattedName = lastName + ", " + prefix + " " + firstName + middleName + ", " + suffix;;
        System.out.println(formattedName);
        return formattedName;

    }

    public static String format(String fullName) {
        String[] nameP = fullName.split("\\.");
        String prefix = nameP[0];
        String[] nameFM = fullName.split(" ");
        String formattedName = prefix + nameFM;
        return formattedName;
    }

    @Override
    public String toString() {
        return "NameFormatter{" +
                "prefix='" + prefix + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", suffix='" + suffix + '\'' +
                '}';
    }
}