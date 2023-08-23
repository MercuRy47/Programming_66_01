package HomeWork4;

import java.util.Scanner;

public class HM4_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int amount = kb.nextInt();

        int sum = 0;

        for(int i = 1;i <= amount;i++){
            if(i < amount){
                System.out.print(num + " + ");
            }
            sum += num;
        }
        System.out.println(num + " = " + sum);
    }
}
