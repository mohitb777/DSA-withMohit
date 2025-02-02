package pratice1_basic;

import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Whole number ");
        int n= input.nextInt();
        System.out.println("Enter the number which you have to find");

        int m= input.nextInt();


        int count = 0;
        while (n>0){
            int rem = n % 10;
            if(rem == m) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);

    }
}
