package com.pluralsight.CustomCollections;

public class CustomCollectionsMain {
    public static void main(String[] args) {
        Box boxL = new Box();
        Box boxB = new Box();

        Laptop laptop = new Laptop();
        Book book = new Book();

        boxL.setContent(laptop);
        boxB.setContent(book);



    }
}
