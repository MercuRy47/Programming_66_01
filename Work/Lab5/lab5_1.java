package Lab5;

public class lab5_1 {
    public static void main(String[] args) {

        int sum = 0;

        // Loop 1+3+5+...+999
        for(int i = 1;i<=1000;i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}