package HomeWork2;

import java.util.Scanner;

public class HM2_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int minutes = kb.nextInt();
        int pay = 0;

        if (minutes > 60) {
            int hours = (minutes - 60) / 60;
            pay = (hours * 10) + (minutes % 60 != 0 ? 10 : 0);
        }

        System.out.print(pay);
    }
}