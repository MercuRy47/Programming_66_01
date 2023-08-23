package HomeWork5;

import java.util.Scanner;

public class hm5_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int targetNumber = 25; // เลขท้ายที่ออก

        int guesses = 0;
        int wrongGuesses = 0;

        while (true) {
            int userGuess = kb.nextInt();
            guesses++;

            if (userGuess == targetNumber) {
                break;
            } else {
                wrongGuesses++;
            }
        }

        for (int i = 0; i < wrongGuesses; i++) {
            System.out.println("no");
        }
        System.out.println("yes " + guesses);
    }
}