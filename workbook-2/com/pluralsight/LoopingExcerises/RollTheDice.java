package com.pluralsight.LoopingExcerises;

import java.util.Scanner;

public class RollTheDice {
   private static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
      Dice dice = new Dice();
      int twoCount = 0;
      int fourCount = 0;
      int sixCount = 0;
      int sevenCount = 0;
      int rollCount = 0;

      for (int i = 0; i < 100; i++) {
          int roll1 = dice.roll();
          int roll2 = dice.roll();
          int fullroll = roll1 + roll2;

          if (roll1 + roll2 == 2) {
              twoCount++;
          } else if (roll1 + roll2 == 4) {
              fourCount++;
          } else if (roll1 + roll2 == 6) {
              sixCount++;
          } else if (roll1 + roll2 == 7) {
              sevenCount++;
          } else {
              rollCount++;
          }

          System.out.println("Roll " + rollCount + ": "  + roll1 + " - " + roll2 + " Sum: " + fullroll);

      }

          System.out.println("The number of 2s that were rolled:" + twoCount);
          System.out.println("The number of 4s that were rolled:" + fourCount);
          System.out.println("The number of 6s that were rolled:" + sixCount);
          System.out.println("The number of 7s that were rolled:" + sevenCount);

      }
   }
// not done yet
