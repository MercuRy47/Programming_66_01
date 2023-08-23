package HomeWork3;

import java.util.Scanner;

public class HM3_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        // Input
        int year = kb.nextInt();

        // Default value
        String result = "common year";

        // Chack leap year
        // leap year is a year that is evenly divisible by 4 (year % 4 = 0) 
        // but is not divisible by 100 (year % 100 != 0) or a year
        // that is evenly divisible by 400 (year % 400 = 0)
        switch (year % 4) {
            case 0:
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        result = "leap year";
                    }else {
                        result = "common year";
                    }
                }else {
                    result = "leap year";
                }
                break;
        }
        System.out.println(result);
    }
}