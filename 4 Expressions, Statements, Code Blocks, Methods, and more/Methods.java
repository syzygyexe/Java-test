package com.company;

public class Main {

    public static void main(String[] args) {
        int levelCompleted = 5;
        int bonus = 100;
        calculateScore(true, 100, levelCompleted, bonus);

        System.out.println("ENDED");
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score is " + finalScore);
            return finalScore;
        }
        // Negative one indicating an error.
        return -1;
    }
}
