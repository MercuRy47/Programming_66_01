package Lab3;

import java.util.Scanner;

public class lab3_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input letter : ");
        char letter = kb.next().charAt(0);

        // Condition 
        if(letter == 'a' || letter == 'e'|| letter == 'i'|| letter == 'o'|| letter == 'u'){
            System.out.println("Vowel");
        }else {
            System.out.println("No Vowel");
        }
    }
}
