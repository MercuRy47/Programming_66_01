package HomeWork6;

import java.util.Scanner;

public class HM6_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int row = kb.nextInt();
        int column = kb.nextInt();

        int num = 1;

        for(int line = 1; line <= row; line++){
            for(int i = 1; i <= column; i++){
                for(int j = 1; j <= column; j++){
                    System.out.print(num);
                }
                System.out.print(" ");
            }
            num++;
            System.out.println();
        }

    }
}
