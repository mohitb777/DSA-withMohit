package Pratice_14_Recursion_Basicquestions;

import java.util.Scanner;

public class factorialrec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(fact(N));
    }
    static int fact (int n){
        if (n<=1){
            return 1;
        }
         return n* fact(n-1);
    }

}
