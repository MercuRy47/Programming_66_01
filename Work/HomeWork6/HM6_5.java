package HomeWork6;

import java.util.Scanner;

public class HM6_5 {
    public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);

            int amount = kb.nextInt();

            for(int i = 1; i <= amount; i++){
                for(int j = 1; j <= 2*amount-1; j++){
                    if(j <= i-1 || j >= 2*amount-i+1){
                        System.out.print("=");
                    }else {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
    }
}
