package HomeWork2;

import java.util.Scanner;

public class HM2_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        if(num < 0){
            System.out.println("Negative");
        }else if(num > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Zero");
        }
    }
}
 