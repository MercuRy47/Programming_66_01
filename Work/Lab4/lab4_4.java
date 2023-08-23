package Lab4;

import java.util.Scanner;

public class lab4_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input Celsius : ");
        int C = kb.nextInt(); // C = Celsius
        System.out.print("Input Weather(R|S) : ");
        char W = kb.next().charAt(0); // W = Weather

        // Condition
        int AC; // AC = Assign Celsius
        if(C <= 30) {
            AC = 1;
        }else {
            AC = 0;
        }

        switch (W) {
            // Rainy Day
            case 'R':
                switch (AC) {
                    case 1:
                        System.out.println("Badminton");
                        break;
                    case 0:
                        System.out.println("Yoga");
                        break;
                }
                break;
            
            // Sunny Day
            case 'S':
                switch (AC) {
                    case 1:
                        System.out.println("Football");
                        break;
                    case 0:
                        System.out.println("Swim");
                        break;
                }
                break;
        }
    }
}
