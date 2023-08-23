package HomeWork3;

import java.util.Scanner;

public class HM3_5_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int minutes = kb.nextInt();
        int buy = kb.nextInt();

        int pay = 0;
        int hours;

        int AC = 0;
        if(buy > 1000){
            AC = 1;
        }else if(buy >= 500 && buy <= 1000){
            AC = 2;
        }else if(buy > 0 && buy < 500){
            AC = 3;
        }else if(buy == 0){
            AC = 4;
        }

        switch (AC) {
            case 1:
                pay = 0;
            break;

            case 2:
                if(minutes < 120){
                    pay = 0;
                }else {
                    hours = (minutes - 120) / 60;
                    pay = (hours * 10) + (minutes % 60 != 0 ? 10 : 0);
                }
            break;

            case 3:
                if(minutes < 60){
                    pay = 0;
                }else {
                    hours = (minutes - 60) / 60;
                    pay = (hours * 15) + (minutes % 60 != 0 ? 15 : 0);
                }
            break;

            case 4:
                hours = minutes / 60;
                pay = (hours * 20) + (minutes % 60 != 0 ? 20 : 0);
            break;
        }

        System.out.println(pay);
    }
}