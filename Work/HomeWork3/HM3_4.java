package HomeWork3;

import java.util.Scanner;

public class HM3_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Array 12 month
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        //  Position in Array :String[] months = {"JAN"(1), "FEB"(2), "MAR"(3), "APR"(4), "MAY"(5),
        // "JUN"(6), "JUL"(7), "AUG"(8), "SEP"(9), "OCT"(10), "NOV"(11), "DEC"(12)};

        // Input
        int day = kb.nextInt();
        int month = kb.nextInt();
        int year = kb.nextInt();

        // Variable chack months (Default value)
        boolean isValidDate = true;

        // Chack month 1-12
        if (month < 1 || month > 12) {
            isValidDate = false;
        } else {
            // Chack months 30 Day
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day < 1 || day > 30) {
                        isValidDate = false;
                    }
                    break;
                // Chack month 2 (28 or 29 Day)
                // 29 Day every 4 years
                case 2:
                    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                        if (day < 1 || day > 29) {
                            isValidDate = false;
                        }
                    } else {
                        if (day < 1 || day > 28) {
                            isValidDate = false;
                        }
                    }
                    break;
                // Chack months 31 Day
                default:
                    if (day < 1 || day > 31) {
                        isValidDate = false;
                    }
            }
        }

        // True
        if (isValidDate) {
            String monthAbbreviation = months[month - 1];
            System.out.println(day + " " + monthAbbreviation + " " + year);
        } else {
            System.out.println("Invalid"); // False
        }
    }
}