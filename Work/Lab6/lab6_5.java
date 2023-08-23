package Lab6;

import java.util.Scanner;

public class lab6_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int row = kb.nextInt();
        int group = kb.nextInt();
        int column = kb.nextInt();

        for(int line = 1; line <= row; line++){
            for(int i = 1; i <= group; i++){
                for(int j = 1; j <= column; j++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
