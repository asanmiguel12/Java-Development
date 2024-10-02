package Practice;

import java.util.Scanner;

public class MiniExercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "Adrian";
        int age = 27;
        String phoneNumber = "650-243-8999";
        boolean IsWeatherNice = false;
        String weight = "195lbs";
        System.out.println("What is the radius of your table? : ");
        double r = scanner.nextDouble();
        double pi = Math.PI; // was not working
        double cf = r * 2 * 3.14; // tired cf = Math.PI(r*2) but error
        System.out.printf("Your table's circumference is " + "%.2f", cf);
        scanner.nextLine();

        System.out.println("\nWhat is your name? : ");
        String yourName = scanner.nextLine();
        for (int i = yourName.length(); i <= yourName.length(); i++) {
            char character = yourName.charAt(0);
            System.out.println(character);
        }

        String answerToLife = "Change";
        int [] rando = {1,2,3,4,5,6,7,8,9,10};
        System.out.printf("This is your random number " + String.valueOf(Math.random())); //idk how to do this yet


        System.out.println("\nWhat length is one side of your triangle? : ");
        double side1 = scanner.nextDouble();
        double a = Math.pow(side1, 2);
        System.out.println("What length is the second side of your triangle? : ");
        double side2 = scanner.nextDouble();
        double b = Math.pow(side2, 2);
        double c = Math.sqrt(a + b);
        System.out.printf("The hypotenuse of your triangle is : %.2f", c);

    }
}
