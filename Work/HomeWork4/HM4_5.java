package HomeWork4;

import java.util.Scanner;

public class HM4_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num1 = kb.nextInt();
        int num2 = kb.nextInt();

        int startNum, endNum;
        if (num1 < num2) {
            startNum = num1;
            endNum = num2;
        } else {
            startNum = num2;
            endNum = num1;
        }

        for (int i = startNum; i <= endNum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
