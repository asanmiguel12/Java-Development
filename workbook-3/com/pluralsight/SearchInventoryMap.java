package com.pluralsight;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public class SearchInventoryMap {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        loadInventory();
    }
    static void loadInventory() {
        try {
            FileReader fileReader = new FileReader("DataFiles/" + "inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;
            String last;

            while ((input = bufReader.readLine()) != null) {
                String[] arrInventory = input.split("\\|");
                int productId = Integer.parseInt(arrInventory[0]);
                Product product1 = new Product(productId, arrInventory[1], Float.parseFloat(arrInventory[2]));
                Map<Integer, Product> inventory = new HashMap<>();
                inventory.put(productId, product1);

              inventory.put(productId,product1);
                last = inventory.toString();

                Scanner scanner = new Scanner(System.in);
                System.out.print("Please enter product id of the product you would like to search: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                Product matchedProduct = inventory.get(id);
                if (matchedProduct == null) {
                    System.out.println("We don't carry that product");
                    scanner.nextLine();
                    inventory.put(productId, product1);
                }
                System.out.printf("We carry %s and the price is $%.2f\n",
                        matchedProduct.getName(), matchedProduct.getPrice());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("No File Found");
            e.printStackTrace();
       }
    }
}
