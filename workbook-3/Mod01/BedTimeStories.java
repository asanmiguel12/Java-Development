package Mod01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What file would you like to access?" +
                "\nPlease type the number of the story you would like: " +
                "\n 1. Goldilocks and the Three Bears" +
                "\n 2. Hansel and Gretel" +
                "\n 3. Mary Had A Little Lamb");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                FileInputStream goldi = new FileInputStream("DataFiles/" + "goldilocks.txt");
                Scanner scanner = new Scanner(goldi);
                String input;
                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }

            } else if (choice == 2) {
                FileInputStream handg = new FileInputStream("DataFiles/" + "hansel_and_gretel.txt");
                Scanner scanner = new Scanner(handg);
                String input2;
                while (scanner.hasNextLine()) {
                    input2 = scanner.nextLine();
                    System.out.println(input2);
                }
            } else {
                FileInputStream mary = new FileInputStream("DataFiles/" + "mary_had_a_little_lamb.txt");
                Scanner scanner = new Scanner(mary);
                String input3;
                while (scanner.hasNextLine()) {
                    input3 = scanner.nextLine();
                    System.out.println(input3);
                }
            }
            scanner.close();
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}