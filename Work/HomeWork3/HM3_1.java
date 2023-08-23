package HomeWork3;

import java.util.Scanner;

public class HM3_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num1 = kb.nextInt();
        int num2 = kb.nextInt();

        char op = kb.next().charAt(0);

        switch (op) {
            case '+':
                num1 = (num1 + num2);
                break;
            case '-':
                num1 = (num1 - num2);
                break;
            case '*':
                num1 = (num1 * num2);
                break;
            case '/':
                num1 = (num1 / num2);
                break;
        }
        System.out.println(num1);
    }
}