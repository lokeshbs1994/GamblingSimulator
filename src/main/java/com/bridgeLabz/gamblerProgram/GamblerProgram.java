package com.bridgeLabz.gamblerProgram;

public class GamblerProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambler Program");
        int wins = 0;
        int loss = 0;
        int bet = 1;
        int totalAmount = 0;
        for (int day = 1; day <= 20; day++) {
            int stake = 100;
            while (stake > 50 && stake < 150) {
                double gameCheck = Math.floor(Math.random() * 10) % 2;
                if (bet == gameCheck) {
                    //System.out.println("you won the game");
                    stake++;
                } else {
                    //System.out.println("you lost the game");
                    stake--;
                }
            }
            if (stake == 50) {
                loss++;
                System.out.println("Day " + day + " Lost ");
            } else {
                wins++;
                System.out.println("Day " + day + " Won ");
            }
        }

        int finalAmount = wins * 50 - loss * 50;
        if (finalAmount > 0)
            System.out.println("After 20 days Gambler won: $ " + finalAmount);
        else if (finalAmount < 0)
            System.out.println("After 20 days Gambler lost: $ " + finalAmount);
        else
            System.out.println("No profit or loss ");
    }
}
