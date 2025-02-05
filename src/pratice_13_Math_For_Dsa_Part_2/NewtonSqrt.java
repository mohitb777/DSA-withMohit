package pratice_13_Math_For_Dsa_Part_2;

import java.util.Scanner;

public class NewtonSqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println((sqrt(n)));
    }
    static double sqrt (int n){
       double x = n;
       double root;
       while (true){
           root = 0.5 *(x + (n/x));

           if (Math.abs(root - x) < 0.0001){
               break;
           }
           x = root;
        }

        return root;
    }
}
