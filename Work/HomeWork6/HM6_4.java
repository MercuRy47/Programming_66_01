package HomeWork6;

import java.util.Scanner;

public class HM6_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int row_column = kb.nextInt();

        int num = 1;

        for (int i = 0; i < row_column; i++) {
            for (int j = 0; j < row_column; j++) {
                if (i == 0 || i == row_column - 1 || j == 0 || j == row_column - 1) {
                    System.out.print(num);
                } else {
                    System.out.print("=");
                }
            }
            num++;
            System.out.println();
        }
    }
}