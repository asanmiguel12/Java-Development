package com.pluralsight.AssestManager;

public class AssetManagerMainApp {
    public static void main(String[] args) {
        House myHouse = new House("Two Story Cabin", "12/12/1996", 800000, 1800, 8000);
        myHouse.setCondition(4);
        myHouse.setLotSize(8000);
        myHouse.setSquareFoot(1800);
        System.out.println(myHouse.getValue());
    }
}
