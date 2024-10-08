package Practice;

import java.util.Scanner;

public class SleepCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to my sleep calculator app! \n" +
                "What is the current hour and min? (hh:mm) ");
        int time = scanner.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(i);
        }
    }
}
