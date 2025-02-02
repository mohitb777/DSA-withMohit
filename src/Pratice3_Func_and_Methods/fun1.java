package Pratice3_Func_and_Methods;

import java.util.Scanner;

public class fun1 {
    public static void main (String[] args) {
        //sum();
        int ans = sum2();
        System.out.println(ans);

    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st no");
        int num1 = in.nextInt();
        System.out.println("enter 2st no");
        int num2 = in.nextInt();
        int hum = num1 + num2;
        System.out.println("sum is " + hum);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st no");
        int num1 = in.nextInt();
        System.out.println("enter 2st no");
        int num2 = in.nextInt();
        int hum = num1 + num2;
        return hum;
    }
}
