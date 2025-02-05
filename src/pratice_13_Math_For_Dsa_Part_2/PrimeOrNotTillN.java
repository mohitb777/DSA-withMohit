package pratice_13_Math_For_Dsa_Part_2;

import java.util.Scanner;

public class PrimeOrNotTillN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
           boolean[] prime = new boolean[n+1];
           sieve(n,prime);
    }

    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i < n ; i++) {
                 if(!primes[i]){
                     for (int j = i*2 ; j <=n ; j+=i) {
                        primes[j] = true;
                     }
                 }
        }
        for (int i = 2; i <=n ; i++) {
            if (!primes[i]){
                System.out.println(i + " ");
            }
        }
    }
}
