package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to HighScoreWins!");
        System.out.println("Please enter the results of the game in the following format: \n" +
                "Home:Visitor|21:9");
        String gameinput = scanner.nextLine();
        String[] participantsAndScores = gameinput.split(Pattern.quote("|"));
        String[] participants = participantsAndScores[0].split(Pattern.quote(":"));
        String[] scores = participantsAndScores[1].split(Pattern.quote(":"));
        String team1 = participants[0];
        String team2 = participants[1];
        String teamScore1 = scores[0];
        String teamScore2 = scores[1];
        int teamScoreFinal1 = Integer.parseInt(teamScore1);
        int teamScoreFinal2 = Integer.parseInt(teamScore2);


        if (teamScoreFinal1 > teamScoreFinal2) {
            System.out.println("The winning team is : " + team1 +
                    "\nScore : " + teamScoreFinal2);
        }
        if (teamScoreFinal1 == teamScoreFinal2) {
            System.out.println("It's a tie!");
        }
            System.out.println("The winning team is : " + team2 +
                "\nScore : " + teamScoreFinal2);

    }
}
