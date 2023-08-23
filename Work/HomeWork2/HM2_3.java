package HomeWork2;

import java.util.Scanner;

public class HM2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int minNumber = number1; 

        if (number2 < minNumber) {
            minNumber = number2;
        }

        if (number3 < minNumber) {
            minNumber = number3;
        }

        System.out.println(minNumber);
    }
}