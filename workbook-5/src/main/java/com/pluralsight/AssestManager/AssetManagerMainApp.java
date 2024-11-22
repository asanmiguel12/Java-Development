package com.pluralsight.AssestManager;

import java.util.ArrayList;

public class AssetManagerMainApp {
    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<Asset>();
        House myHouse = new House("Two Story Townhouse", "12/12/1996", 800000, 1800, 8000, 1);
        Vehicle myCar = new Vehicle("Audi A3", "Personal Car", 2015, 80000, "12/12/2020", 15000);
        myAssets.add(myCar);
        myAssets.add(myHouse);

        System.out.println(myHouse.getValue());
        System.out.println(myCar.getValue());
        System.out.println(myAssets);

        for (Asset a : myAssets) {
            System.out.println(a.getDescription() + " - " + a.getDateAcquired() + " - $" + a.getValue());
        }

    }
}
