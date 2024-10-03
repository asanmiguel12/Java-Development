package Practice;

import java.util.Scanner;

public class MiniProjectScoreCounter1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to my MiniScoreCounter! \n" +
                "Please enter 5 separate test scores between 1-10");
        double test1 = input("Test Score 1 : ");
        double test2 = input("Test Score 2 : ");
        double test3 = input("Test Score 3 : ");
        double test4 = input("Test Score 4 : ");
        double test5 = input("Test Score 5 : ");
        scanner.close();

        double[] allTests = {test1, test2, test3, test4, test5};
        int highScores = 0;
            for (int i = 0; i < 5; i++) {
            }
            for (double score : allTests) {
                if (score >= 7) {
                   highScores++;
                }
                System.out.println("You have " + highScores + " tests at a score of 7 or above.");
            }
        }

    public static double input(String message) {
        System.out.println("Please enter 1-10 for " + message);
        return scanner.nextDouble();
    }
}
