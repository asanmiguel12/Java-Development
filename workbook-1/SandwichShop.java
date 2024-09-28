import java.util.Scanner;

public class SandwichShop {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is your sandwich size 1 for regular size or 2 for large size : ");
        int sandwichOption = scanner.nextInt();
        System.out.println("Would you like your sandwich loaded? (Y)es or (N)o: ");
        String loaded = scanner.nextLine();
        System.out.println("How old are you: ");
        int age = scanner.nextInt();
        double price;
        String loadedaddon;

        if (sandwichOption == 1) {
            price = 5.45;
        } else {
            price = 8.95;
        }

        if (age <= 17) {
            System.out.println("Your Total is: " + (price - (price * .1)));
            }
            if (age >= 65) {
            System.out.println("Your Total is: " + (price - (price * .2)));
            } else {
                System.out.println("Your Total is: " + price);
            }
        }
    }
