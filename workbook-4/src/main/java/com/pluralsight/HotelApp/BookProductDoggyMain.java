package com.pluralsight;

import com.pluralsight.Doggy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookProductDoggyMain {
    public static void main(String[] args) {
        com.pluralsight.Book mine = new com.pluralsight.Book("ABC", "God", 5, 60);
        mine.bookDetails();
        mine.seniorDiscount();


        Doggy Bobby = new Doggy("Bobby", "Pit bull", "wafwafwafwafwaf");
        System.out.println(Bobby.getSound());
        Bobby.bark();
        Bobby.walk("Adrian");
        List<String> people = new ArrayList<>();
        Collections.addAll(people, "Gabe", "Bryan");
        Bobby.walk(people.getFirst());


        Product p = new Product("303a",12, "Hammer");
        System.out.println(Arrays.toString(p.fullProductCode()));
        p.productDetails();
    }
}