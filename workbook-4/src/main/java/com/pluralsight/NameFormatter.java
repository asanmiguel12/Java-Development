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


    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getLastName() {
        return lastName;
    }

//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getPrefix() {
//        return prefix;
//    }
//
//    public void setPrefix(String prefix) {
//        this.prefix = prefix;
//    }

    public static String format(String firstName, String lastName) {
//        NameFormatter name = new NameFormatter("Mr.", "Adrian", "Christian", "San Miguel", "1st");
//        NameFormatter[] format1 = new NameFormatter[]{name};
//        System.out.println(Arrays.toString(format1));
//        return Arrays.toString(format1);
        String formattedName = lastName+ firstName;
        System.out.println(lastName + ", " + firstName);
        System.out.println(formattedName);
        return formattedName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
//        NameFormatter name = new NameFormatter("Mr.", "Adrian", "Christian", "San Miguel", "1st");
//        NameFormatter[] format1 = new NameFormatter[]{name};
//        System.out.println(Arrays.toString(format1));
//        return Arrays.toString(format1);
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