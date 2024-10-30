package com.pluralsight.AssestManager;

import java.util.ArrayList;

public class AssetManagerMainApp {
    public static void main(String[] args) {
        ArrayList
        House myHouse = new House("Two Story Cabin", "12/12/1996", 800000, 1800, 8000, 1);

        System.out.println(myHouse.getValue());
    }
}
