package HomeWork2;

import java.util.Scanner;

public class HM2_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        if(num%5 == 0 && num%3 == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}