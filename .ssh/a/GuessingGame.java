package com.mycompany.guessinggame;

import java.util.*;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 100 + 1);

        int answer = 0;

        int count = 0;

        System.out.println("Guess a number from 1 to 100");

        while (answer != number) {
            answer = scanner.nextInt();
            if (answer == number) {
                System.out.println("You Win! ");
                break;
            } else if (count == 10) {
                System.out.println("You used all your attempts! ");
                break;
            } else if (answer < number) {
                System.out.println("Higher!");
            } else if (answer > number) {
                System.out.println("Lower!");
            }
            count++;
        }

    }
}
