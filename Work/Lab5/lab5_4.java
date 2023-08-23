package Lab5;

import java.util.Scanner;

public class lab5_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // input amount preson
        System.out.print("Input amount of person (N): ");
        int person = kb.nextInt();

        // One person one weight
        int[] weights = new int[person];
        for (int i = 0; i < person; i++) {
            System.out.print("Input weight of person [" + (i + 1) + "]: ");
            weights[i] = kb.nextInt();
        }

        // Variable
        int max_weight = weights[0];
        int min_weight = weights[0];
        int sum_weight = weights[0];

        // Loop
        for (int i = 1; i < person; i++) {

            // Max weight
            if (weights[i] > max_weight) {
                max_weight = weights[i];
            }

            // Min weight
            if (weights[i] < min_weight) {
                min_weight = weights[i];
            }

            // Plus weights
            sum_weight += weights[i];
        }

        // Average weight
        double sum_all = (double)sum_weight/person;

        System.out.println("Max weight : " + max_weight);
        System.out.println("Min weight : " + min_weight);
        System.out.printf("Average weight : %.2f%n", sum_all);
    }
}