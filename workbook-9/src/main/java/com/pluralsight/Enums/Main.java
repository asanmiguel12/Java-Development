package com.pluralsight.Enums;

import static com.pluralsight.Enums.UserRole.USER;

public class Main {

    public static void main(String[] args) {
        User user = new User(USER, "Adrian");

        if (user.getUserRole() == USER){
            System.out.println("Don't break the application please");
        }

        System.out.println(UserRole.ADMIN.ordinal());

        switch (user.getUserRole()) {
            case USER:
                System.out.println("Repeat");
                break;
            case ADMIN:
                System.out.println("Be responsible");
                break;
            case EDITOR:
                System.out.println("Be creative");
                break;
        }



    }
}
