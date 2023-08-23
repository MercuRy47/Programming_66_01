package Lab6;

import java.util.Scanner;

public class lab6_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        
        // แสดงดอกจันตามคำอธิบาย
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(); // ขึ้นบรรทัดใหม่

        // แสดงดอกจัน (n-2) ตัว
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
        }
        System.out.println(); // ขึ้นบรรทัดใหม่

        // แสดงดอกจัน (n-4) ตัว ถ้า n > 4
        if (n > 4) {
            for (int i = 0; i < n - 4; i++) {
                System.out.print("*");
            }
            System.out.println(); // ขึ้นบรรทัดใหม่
        }
    }
}
