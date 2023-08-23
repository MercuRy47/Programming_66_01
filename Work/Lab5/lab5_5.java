package Lab5;

import java.util.Scanner;

public class lab5_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Input number
        System.out.print("Input: ");
        int number = kb.nextInt();

        // Condition
        if (number <= 0) {
            System.out.println("Output: " + number);
        } else {
            System.out.print("Output: " + number + " ");

            // Loop *
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
        }
    }
}
