package Practice;

import java.util.Scanner;

public class MiniProjectShop {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome To Adrian's Shop!");
    }
    public static int userInput(int message) {
        System.out.println("Please choose what items you would like to add to your cart : " + message);
        return scanner.nextInt();
    }
}
