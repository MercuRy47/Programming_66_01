package Lab4;

import java.util.Scanner;

public class lab4_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input letter : ");
        char letter = kb.next().charAt(0);

        // Condition
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
        
            default:
                System.out.println("No Vowel");
                break;
        }
    }
}
