package Lab6;

import java.util.Scanner;

public class lab6_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // รับค่าจำนวนแถว (row) และจำนวนคอลัมน์ (column)
        int row = kb.nextInt();
        int column = kb.nextInt();

        // วนลูปเพื่อสร้างและแสดงรูปสี่เหลี่ยมพื้นผ้า
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // ตรวจสอบว่าเป็นบริเวณกรอบหรือไม่
                if (i == 0 || i == row - 1 || j == 0 || j == column - 1) {
                    System.out.print("+");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println(); // เมื่อแสดงครบ column คอลัมน์ในแถวนี้ให้ขึ้นบรรทัดใหม่
        }
    }
}