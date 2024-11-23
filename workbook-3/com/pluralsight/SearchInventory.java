package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("DataFiles/" + "inventory.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);

        String input = bufReader.readLine();


//            while ((input = bufReader.readLine()) != null) {
//            String[] fixedproducts = input.split("\\|");
//           Product product = new Product(Integer.parseInt(fixedproducts[0]), fixedproducts[1], Integer.parseInt(fixedproducts[2]));


        ArrayList<Product> inventory = getInventory();
            System.out.println("We carry the following inventory: ");
            for (int i = 0; i < inventory.size(); i++) {
                Product p = inventory.get(i);
                System.out.printf("id: %d" + " | %s" + " | Price: $%.2f\n",
                        p.getId(), p.getName(), p.getPrice());
            }
        }
        public static ArrayList<Product> getInventory() {
            ArrayList<Product> inventory = new ArrayList<Product>();
            Product paintA = new Product (1,"PaintA",12.99f);
            Product paintB = new Product (2,"PaintB",12.99f);
            Product paintC = new Product (3,"PaintC",12.99f);
            Product paintD = new Product (4,"PaintD",12.99f);
            Product paintE = new Product (5,"PaintE",12.99f);
            inventory.add(paintA);
            inventory.add(paintB);
            inventory.add(paintC);
            inventory.add(paintD);
            inventory.add(paintE);


            // this method loads product objects into inventory
            // and its details are not shown
            return inventory;
        }
    }



//        inventory.add("567|10' 2x4  (grade B)|9.99");
//        inventory.add("1234|Hammer|19.49");
//        inventory.add("2345|Box of nails|9.29");
//        inventory.add("9154|9-in-1 Ratcheting Screwdriver|24.97");
//        inventory.add("1648|10' Crescent Wrench|15.95");
//        inventory.add("9876|Mechanics Tool Set|119.00");
//        inventory.add("1212|2' Spring Clamp|.99");
//        inventory.add("3434|Large Trigger Clamps|36.97");

