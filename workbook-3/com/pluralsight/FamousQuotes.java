package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    static Scanner scanner = new Scanner(System.in);
    static String[] quotes = {
            "You must be the change you wish to see in the world. -Mahatma Gandhi\n",
            "Spread love everywhere you go. Let no one ever come to you without leaving happier. -Mother Teresa\n",
            "The only thing we have to fear is fear itself. -Franklin D. Roosevelt\n",
            "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that. -Martin Luther King Jr.\n",
            "Do one thing every day that scares you. -Eleanor Roosevelt\n",
            "Well done is better than well said. -Benjamin Franklin\n",
            "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart. -Helen Keller\n",
            "It is during our darkest moments that we must focus to see the light. -Aristotle\n",
            "Do not go where the path may lead, go instead where there is no path and leave a trail. -Ralph Waldo Emerson\n",
            "Be yourself; everyone else is already taken. -Oscar Wilde"};

    public static void main(String[] args) {
        String input2 = " ";
        userInput();
        try {
            System.out.println("Would you like another quote?: (y/n)");
            input2 = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error");
        }
        while (input2.equals("y")) {
            System.out.println("Great! Please select a number from 1-10: ");
            userInput();
        }
        System.out.println("Have a good day!");
    }

    public static String userInput() {
        try {
            System.out.println("Pick a number from 1-10 to get a famous quote!");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("\nHere is your quote : " + quotes[0]);
                    break;
                case "2":
                    System.out.println("\nHere is your quote : " + quotes[1]);
                    break;
                case "3":
                    System.out.println("\nHere is your quote : " + quotes[2]);
                    break;
                case "4":
                    System.out.println("\nHere is your quote : " + quotes[3]);
                    break;
                case "5":
                    System.out.println("\nHere is your quote : " + quotes[4]);
                    break;
                case "6":
                    System.out.println("\nHere is your quote : " + quotes[5]);
                    break;
                case "7":
                    System.out.println("\nHere is your quote: " + quotes[6]);
                    break;
                case "8":
                    System.out.println("\nHere is your quote : " + quotes[7]);
                    break;
                case "9":
                    System.out.println("\nHere is your quote : " + quotes[8]);
                    break;
                case "10":
                    System.out.println("\nHere is your quote : " + quotes[9]);
                    break;

            }
             return input;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}