package HomeWork6;

import java.util.Scanner;

public class HM6_2 {
    public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);

            int amount = kb.nextInt();

            for(int i = 1; i <= amount; i++){
                for(int j = 0; j < amount; j++){
                    if(i % 2 == 1){
                        System.out.print(">");
                    }else {
                        System.out.print("<");
                    }
                }
                System.out.print(" ");
                for(int j = 0; j < amount; j++){
                    if(i % 2 == 1){
                        System.out.print("<");
                    }else {
                        System.out.print(">");
                    }
                }
                System.out.println();
            }
    }
}
