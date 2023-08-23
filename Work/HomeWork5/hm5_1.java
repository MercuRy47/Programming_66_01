package HomeWork5;

import java.util.Scanner;

public class hm5_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 0;

        int startNum = kb.nextInt();
        int endNum = kb.nextInt();

        for(int i = startNum; i <= endNum; i++){
            if(i % 2 == 0){
                sum = sum + 0;
                System.out.print("");
            }else {
                sum = sum + i;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n%d",sum);
    }
    
}