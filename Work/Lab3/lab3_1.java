package Lab3;

import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        // Condition 
        if(num > 0){
            System.out.println("Your number more than zero");
        }else {
            System.out.println("Your number less or equal zero");
        }
    }
}
