package pratice_13_Math_For_Dsa_Part_2;

import java.util.ArrayList;
import java.util.Scanner;

public class factors_of_the_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        //factors(N);
        //factorsinsqrn(N);
        factorsinsqrnmakeitsorted(N);
    }

    static void factors(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void factorsinsqrn(int n) {
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                }
                System.out.print(i + " " + n / i + " ");
            }
        }
    }

    static void factorsinsqrnmakeitsorted(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
