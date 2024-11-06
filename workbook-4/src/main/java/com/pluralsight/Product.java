package com.pluralsight;

public class Product {
    String id = "303a";
    double quantity = 55;
    String name = "Hammer";

    public Product(String id, double quantity, String name) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
    }

    public void productDetails() {
        System.out.println(quantity + "-" + id + "-" + name);

    }

    public String[] fullProductCode() {
       String[] productCode = {id, String.valueOf(quantity), name};
       return productCode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                '}';
    }
}