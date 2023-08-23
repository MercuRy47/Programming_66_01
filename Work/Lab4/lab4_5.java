package Lab4;

import java.util.Scanner;

public class lab4_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input Member (Y|N): ");
        char member = kb.next().charAt(0);
        System.out.print("Input Price : ");
        int price = kb.nextInt();
        

        // Condition
        int pay = 0;
        if (price > 5000) {
            pay = 4;
        } else if (price > 2000) {
            pay = 3;
        } else if (price > 1000) {
            pay = 2;
        } else if (price > 500) {
            pay = 1;
        }

        switch (member) {
            // Member
            case 'Y':
                switch (pay) {
                    // Calculate
                    case 0:
                        break;
                    case 1:
                        price = price - (price*3/100);
                        break;
                    case 2:
                        price = price - (price*4/100);
                        break;
                    case 3:
                        price = price - (price*7/100);
                        break;
                    case 4:
                        price = price - (price*10/100);
                        break;
                }
                break;
            
            // No Member
            case 'N':
                switch (pay) {
                    // Calculate
                    case 0:
                    case 1:
                        break;
                    case 2:
                        price = price - (price*3/100);
                        break;
                    case 3:
                        price = price - (price*3/100);
                        break;
                    case 4:
                        price = price - (price*7/100);
                        break;
                }
                break;
        }
        System.out.println(price);
    }
}
