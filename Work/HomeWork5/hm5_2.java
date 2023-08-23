package HomeWork5;

import java.util.Scanner;

public class hm5_2{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();

        for(int i = 0; i <= number; i++){
            number = number / 10;
            number = number * 10;
            
            System.out.print(number + " ");
            number = number - 10;
            
        }
        if(number == 0){
            System.out.println(0);
        }
    }
}