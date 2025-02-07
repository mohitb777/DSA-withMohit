package Pratice_14_Recursion_Basicquestions;

import java.util.Scanner;

public class conceptofMinusMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        fun(n);
    }
    static  void fun(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
       // fun(n--);
            fun(--n);
                   }
}
