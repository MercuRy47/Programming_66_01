package Lab6;

import java.util.Scanner;

public class lab6_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int row = kb.nextInt();
        int column = kb.nextInt();

        int num = 1;

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                System.out.print(num +" ");
            }
            num++;
            System.out.println();
        }
    }
}
