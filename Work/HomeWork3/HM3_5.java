package HomeWork3;

import java.util.Scanner;

public class HM3_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int minutes = kb.nextInt();
        int buy = kb.nextInt();

        int pay = 0;
        int hours;

        // > 1000 = free
        if(buy > 1000){
            pay = 0;

        // 500 - 1000 = free 2h, +1h = 10;
        }else if(buy >= 500 && buy <= 1000){
            if(minutes < 120){
                pay = 0;
            }else {
                hours = (minutes - 120) / 60;
                pay = (hours * 10) + (minutes % 60 != 0 ? 10 : 0);
            }

        // < 500 = free 1h, +1h = 15;
        }else if(buy < 500 && buy > 0){
            if(minutes < 60){
                pay = 0;
            }else {
                hours = (minutes - 60) / 60;
                pay = (hours * 15) + (minutes % 60 != 0 ? 15 : 0);
            }

        // Not buy = 1h = 20
        }else if(buy == 0){
            hours = minutes / 60;
            pay = (hours * 20) + (minutes % 60 != 0 ? 20 : 0);
        }

        System.out.println(pay);
    }
}