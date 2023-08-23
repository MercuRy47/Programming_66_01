package HomeWork4;

import java.util.Scanner;

public class HM4_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        for(int i = 1;i <= 12;i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
