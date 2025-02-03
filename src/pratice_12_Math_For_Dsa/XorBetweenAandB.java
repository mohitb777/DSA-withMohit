package pratice_12_Math_For_Dsa;

import java.util.Scanner;

public class XorBetweenAandB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers (a and b) to find XOR between them:");
        int a = input.nextInt();
        int b = input.nextInt();
        input.close(); // Closing scanner to prevent memory leak

        int ans = xor(b) ^ xor(a - 1);
        System.out.println("XOR from " + a + " to " + b + " is: " + ans);
    }

    // Corrected method name from noare to xor
    public static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
        return 0;
    }
}
