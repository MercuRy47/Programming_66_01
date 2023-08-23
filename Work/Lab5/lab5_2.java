package Lab5;

import java.util.Scanner;

public class lab5_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Input numbers
        System.out.print("Input number 1 and number 2 : ");
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();

        // Condition Startnumber and Endnumber
        int startNum, endNum;
        if (num1 < num2) {
            startNum = num1;
            endNum = num2;
        } else {
            startNum = num2;
            endNum = num1;
        }

        // Loop print number
        for (int i = startNum; i <= endNum; i++) {
            if (i % 3 == 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}