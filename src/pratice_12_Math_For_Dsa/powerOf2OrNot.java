package pratice_12_Math_For_Dsa;

import java.util.Scanner;

public class powerOf2OrNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that u wnat to check that it is pwer of 2 or not");
        int n = input.nextInt();
        System.out.println(noare(n));
    }
    public static boolean noare(int n){
        if (n == 0){
            return false;
        }
        if((n & (n-1)) == 0){
            return true;
            }
            else {
                return false;
        }
    }
}
