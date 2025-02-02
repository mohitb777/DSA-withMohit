package Pratice3_Func_and_Methods;

import java.util.Scanner;

public class parafun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String r = in.next();
        String personalised = myGreet(r);
        System.out.println(personalised);
        int ans = sum3 (a, b);
        System.out.println(ans);
    }

     static String myGreet(String name) {
            String message = "hello " + name ;
            return message;
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
