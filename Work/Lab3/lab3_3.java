package Lab3;

import java.util.Scanner;

public class lab3_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input temperature (fahrenheit) : ");
        double F = kb.nextInt();

        // Fahrenheit to Celsius
        double C = (F - 32)*5/9;
        System.out.println("Temperature (celsius) : " + C);

        // Condition 
        if(C < 23){
            System.out.println("Weather : Cold");
        }else if(C > 23 && C < 28){
            System.out.println("Weather : Cool");
        }else if(C > 28 && C < 33){
            System.out.println("Weather : Warm");
        }else {
            System.out.println("Weather : Hot");
        }
    }
}
