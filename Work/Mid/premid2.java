package Mid;

import java.util.Scanner;

public class premid2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("กรุณากรอกจำนวนนักเรียน (N): ");
        int N = kb.nextInt();

        int highest = Integer.MIN_VALUE;  // คะแนนสูงสุด
        int secondHighest = Integer.MIN_VALUE;  // คะแนนสูงสุดลำดับที่สอง

        for (int i = 0; i < N; i++) {
            System.out.print("กรอกคะแนนของนักเรียนที่ " + (i + 1) + ": ");
            int score = kb.nextInt();

            if (score > highest) {
                secondHighest = highest;
                highest = score;
            } else if (score > secondHighest && score < highest) {
                secondHighest = score;
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("ไม่มีนักเรียนที่ได้คะแนนสูงสุดลำดับที่สอง");
        } else {
            System.out.println("คะแนนสูงสุดลำดับที่สอง: " + secondHighest);
        }
    }
}