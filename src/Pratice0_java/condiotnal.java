package Pratice0_java;

import java.util.Scanner;

public class condiotnal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        if (s <= 10000) {
            s = s + 2000;
        } else if (s <= 20000) {
            s= s + 4000;
        }else{
            s += 1000;
    }
        System.out.println(s);

    }
}
