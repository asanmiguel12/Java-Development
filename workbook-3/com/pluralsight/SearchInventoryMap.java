package com.pluralsight;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.regex.Pattern;


public class SearchInventoryMap {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        loadInventory();
    }
    static void loadInventory() {
        try {
            FileReader fileReader = new FileReader("DataFiles/" + "inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
             Map<Integer, Product> inventory = new HashMap<>();

            String input = bufReader.readLine();
            String last;

            while ((input = bufReader.readLine()) != null) {
                String[] arrInventory = input.split("\\|");
                int productId = Integer.parseInt(arrInventory[0]);
                Product product1 = new Product(productId, arrInventory[1], Float.parseFloat(arrInventory[2]));
                inventory.put(productId, product1);

                last = inventory.toString();

                Scanner scanner = new Scanner(System.in);
                System.out.print("Please enter product id of the product you would like to search: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                Product matchedProduct = inventory.get(productId);
                if (matchedProduct == null) {
                    System.out.println("We don't carry that product");
                    scanner.nextLine();
                }
                System.out.printf("Product: %s  Price: $%.2f\n",
                        matchedProduct.getName(), matchedProduct.getPrice());
            }
            bufReader.close();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Input Error");
            e.printStackTrace();
       }
    }
}
