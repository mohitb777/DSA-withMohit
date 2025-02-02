package pratice_12_Math_For_Dsa;

import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        System.out.println("enter the base");
        int base = input.nextInt();
        System.out.println(mn(n,base));
    }

    public static int mn(int n,int base) {
        int firstbase = base;
        int ans = 0;
       // int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * firstbase;

        }
        return ans;
    }
}