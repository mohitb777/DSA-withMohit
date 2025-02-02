package pratice_12_Math_For_Dsa;

import java.util.Scanner;

public class powerOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number base number ");
        long n = input.nextInt();
        System.out.println("Enter the powe of the number");
        long b = input.nextInt();
        System.out.println(noare(n,b));
        input.close();
    }
    public static int noare(long base,long power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            {
                base *= base;
                power = power >> 1;
            }
        }
        return ans;

    }
}
