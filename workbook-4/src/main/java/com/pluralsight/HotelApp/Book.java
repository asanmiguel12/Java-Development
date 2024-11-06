package com.pluralsight;

public class Book {
    String author;
    String title;
    double price;
    double buyerAge;

    public Book(String title, String author, double price, double buyerAge) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.buyerAge = buyerAge;
    }

    public void bookDetails() {
        System.out.println("Book Details: " + "\n" +
                "Title: " + this.title + "\n" +
                "Author: " + this.author + "\n" +
                "Price: $" + this.price);
    }

    public void seniorDiscount() {
        if (this.buyerAge > 5) {
            this.price = this.price * .5;
            System.out.println("Discounted Price: $" + this.price);
        }
    }
}


