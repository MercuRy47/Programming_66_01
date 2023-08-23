package Lab5;

import java.util.Scanner;

public class lab5_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num = 0;

        // Loop input value
        while(num != -1){
            System.out.print("Input number : ");
            num = kb.nextInt();

            // Condition if number = -1; print "Good bye"
            if(num == -1){
                System.out.println("Good bye");
                break;
            }
            System.out.println("Your type : " + num);
        }
    }
}