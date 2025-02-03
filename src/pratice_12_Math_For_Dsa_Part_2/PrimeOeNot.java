package pratice_12_Math_For_Dsa_Part_2;

import java.util.Scanner;

public class PrimeOeNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <=n; i++){
            System.out.println(i+" "+ isprime1(i));
        }
    }
    public static boolean isprime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
               return false;
            }
        }
        return true;

    }
    static boolean isprime1(int n){
        if (n <=1 ){
            return false;
        }
        int c= 2;
        while (c*c <= n){
         if (n % c == 0){
             return false;
         }
         c++;
        }
        return true;
    }
    }

