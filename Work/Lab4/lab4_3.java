package Lab4;

import java.util.Scanner;

public class lab4_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input Sex : ");
        char sex = kb.next().charAt(0);
        System.out.print("Input Age : ");
        int age = kb.nextInt();


        switch (sex) {

            // Male
            case 'M':
                // Boy or Man
                switch (age) {
                    case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14:
                        System.out.println("Boy");
                        break;
                    default:
                        System.out.println("Man");
                        break;
                }
            break;

            // Female
            case 'F':
                // Girl or Woman
                switch (age) {
                    case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14:
                        System.out.println("Girl");
                        break;
                    default:
                        System.out.println("Woman");
                        break;
                }
            break;
            default:
                System.out.println("Don't know, What you are.");
                break;
        }
    }
}

