package pratice4shadowing_varargs_funoverloading_and_etc;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n) {
        int orignal = n;
        int sum = 0;
        while (n>0){
           int rem = n% 10 ;
           n = n/10;
           sum = sum + rem+rem+rem;
        }
if  (sum == orignal) {
    return true;
}
return false;
    }
}
