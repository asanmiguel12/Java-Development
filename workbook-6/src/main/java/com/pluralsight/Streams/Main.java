package com.pluralsight.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person meeMah = new Person("Mee", "Mah", 50);
        Person peePah = new Person("Pee", "Pah", 50);
        Person pooPah = new Person("Poo", "Pah", 60);
        Person neeNah = new Person("Nee", "Nah", 35);
        Person weeWah = new Person("Wee", "Wah", 30);

        List<Person> fam = new ArrayList<>();
        fam.add(meeMah);
        fam.add(peePah);
        fam.add(pooPah);
        fam.add(neeNah);
        fam.add(weeWah);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input how to sort your family: " + "\n" +
                "Search by First Name:" + "\n" +
                "Search by Last Name:" + "\n" +
                "Search by Less Than Input Age:");

        String choice = scanner.nextLine();
        List<Person> famSearch = new ArrayList<>();

        for (Person foudPerson : fam) {
            if (choice.equalsIgnoreCase(foudPerson.getFirstName())) {
                famSearch.add(foudPerson);
                System.out.println(foudPerson.getFirstName() + foudPerson.getLastName());
            } else if (choice.equalsIgnoreCase(foudPerson.getLastName())) {
                famSearch.add(foudPerson);
                System.out.println(foudPerson.getFirstName() + foudPerson.getLastName());
            } else if (foudPerson.getAge() <= Integer.parseInt(choice)) {
                famSearch.add(foudPerson);
                System.out.println(foudPerson);
            }
        }

        famSearch.stream().forEach(System.out::println);

        int sum = 0;
        int maxAge = fam.get(0).getAge();
        int minAge = fam.get(0).getAge();

        for (Person p : fam) {
            sum += p.getAge(); // add all ages
            maxAge = Math.max(maxAge, p.getAge()); // get the oldest age
            minAge = Math.min(minAge, p.getAge()); // get the youngest age
        }
        //calculate average age
        double avgAge = (double) (sum/fam.size());

        System.out.println("Average age: " + avgAge);
        System.out.println("Oldest age: " + maxAge);
        System.out.println("Youngest age: " + minAge);
        scanner.close();
    }
}