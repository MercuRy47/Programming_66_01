package Lab3;

import java.util.Scanner;

public class lab3_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input price : ");
        int price = kb.nextInt();

        // Condition
        if(price < 500){
            System.out.println("Total price : " + price);
        }else if(price > 500 && price < 1001){
            price = price-((price*3)/100);
            System.out.println("Total price : " + price);
        }else if(price > 1000 && price < 2001){
            price = price-((price*4)/100);
            System.out.println("Total price : " + price);
        }else if(price > 2000 && price < 5001){
            price = price-((price*7)/100);
            System.out.println("Total price : " + price);
        }else if(price > 5001){
            price = price-((price*10)/100);
            System.out.println("Total price : " + price);
        }
    }
}