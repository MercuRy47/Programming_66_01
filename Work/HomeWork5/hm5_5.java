package HomeWork5;

import java.util.Scanner;

public class hm5_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int sum = 0;
        int n = kb.nextInt();
        
        for(int i = 1; i <= n; i++){
            char letter = kb.next().charAt(0);
            if(letter == 'A'||letter == 'E'||letter == 'I'||letter == 'O'||letter == 'U'){
                sum++;
            }
        }
        System.out.println(sum);
    }
}