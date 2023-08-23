package HomeWork4;

import java.util.Scanner;

public class HM4_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        int sum = 0;

        for(int i = 0;i <= num;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
