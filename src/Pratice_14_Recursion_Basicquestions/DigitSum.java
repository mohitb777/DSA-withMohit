package Pratice_14_Recursion_Basicquestions;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = sum(n);
        System.out.println(ans);
    }
    static int sum (int n){
        if (n==0){
            return 0;
        }
         return (n%10)+ sum(n/10);
    }

}
