package Mid;

import java.util.Scanner;

public class premid1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int passedCount = 0;
        int failedCount = 0;

        System.out.print("กรุณากรอกจำนวนนักเรียน: ");
        int n = kb.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("กรุณากรอกคะแนนของนักเรียนที่ " + i + ": ");
            double score = kb.nextDouble();
            
            if (score >= 60) {
                passedCount++;
            } else {
                failedCount++;
            }
        }

        System.out.println("นักเรียนผ่าน: " + passedCount + " คน");
        System.out.println("นักเรียนตก: " + failedCount + " คน");
    }
}