package HomeWork5;

import java.util.Scanner;

public class hm5_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num = kb.nextInt();

            if(num % 2 == 0){
                for(int i = 1; i <= num; i++){
                    System.out.print("* ");
                }
            }else {
                for(int i = 1; i <= num; i++){  
                    System.out.print("+ ");
                }
            }
    }
}