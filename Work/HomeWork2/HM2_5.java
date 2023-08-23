package HomeWork2;

import java.util.Scanner;

public class HM2_5 {
    public static void main(String[] args) { 
        Scanner kb = new Scanner(System.in);

        int Hour = kb.nextInt(); 
        int Minute = kb.nextInt(); 

        int Add = kb.nextInt(); 

        int All = (Minute + Add) / 60; 
        int All2 = (Minute + Add) % 60; 

        if (All > 0) {
            Hour = Hour + All; 
        }

        if (Hour >= 24) {
            Hour = Hour % 24; 
        }

        System.out.printf("%02d:%02d\n", Hour, All2); 
    }
}
