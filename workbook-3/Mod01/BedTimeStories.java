package Mod01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories {
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What file would you like to access?" +
                "\n Please type the number of the story you would like: " +
                "\n 1. Goldilocks and the Three Bears" +
                "\n 2. Mary Had a Little Lamb" +
                "\n 3. Hansel and Gretel" );

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                while (choice == 1) ;
                FileInputStream goldi = new FileInputStream("DataFiles/" + "goldilocks.txt");
                Scanner scanner = new Scanner(goldi);
                String input;

                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }

                while (choice == 2) ;

                FileInputStream handg = new FileInputStream("DataFiles/" + "hansel_and_gretel.txt");
                Scanner scanner2 = new Scanner(handg);
                String input2;

                while (scanner.hasNextLine()) {
                    input2 = scanner.nextLine();
                    System.out.println(input2);
                }
                while (choice == 3) ;
                FileInputStream mary = new FileInputStream("DataFiles/" + "mary_had_a_little_lamb");
                Scanner scanner3 = new Scanner(mary);
                String input3;

                while (scanner.hasNextLine()) {
                    input3 = scanner.nextLine();
                    System.out.println(input);

                }

                scanner.close();
            }

            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
