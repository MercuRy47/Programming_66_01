package HomeWork3;

import java.util.Scanner;

public class HM3_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Input
        int heat = kb.nextInt();
        char CF = kb.next().charAt(0);

        // Default value
        String temperature = "";
        int chose = 0;

        // Chack C or F
        switch (CF) {
            case 'C':
            // Chack state and configure
                if(heat <= 0){
                    chose = 1; 
                }else if(heat > 0 && heat <100){
                    chose = 2;
                }else if(heat > 99){
                    chose = 3;
                }
                    // Chack value(1-3) and assign variable print
                    switch (chose) {
                        case 1:
                            temperature = "Solid";
                            break;
                        case 2:
                            temperature = "Liquid";
                            break;
                        case 3:
                            temperature = "Gas";
                            break;
                    }
                break;
        
            case 'F':
            // Chack state and configure
                if(heat <= 32){
                    chose = 1; 
                }else if(heat > 32 && heat < 212){
                    chose = 2;
                }else if(heat > 211){
                    chose = 3;
                }
                    // Chack value(1-3) and assign variable print
                    switch (chose) {
                        case 1:
                            temperature = "Solid";
                            break;
                        case 2:
                            temperature = "Liquid";
                            break;
                        case 3:
                            temperature = "Gas";
                            break;
                    }
                break;
        }
        // print variable
        System.out.println(temperature);
    }
}