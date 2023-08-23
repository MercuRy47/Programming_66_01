package Lab6;

import java.util.Scanner;

public class lab6_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int value = kb.nextInt();
        int loopAmount = kb.nextInt();

        int num = 1;
        int num2 = 1;

        for(int i = 1; i <= value; i++){
            for(int j = 1; j <= loopAmount; j++){
                System.out.printf("%d\t%d\n", num, num2);
                num2++;
            }
            num++;
            num2 = 1;
        }
    }
}
