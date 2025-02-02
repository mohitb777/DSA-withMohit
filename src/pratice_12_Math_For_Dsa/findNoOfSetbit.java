package pratice_12_Math_For_Dsa;

import java.util.Scanner;

public class findNoOfSetbit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find it set bit");
        int n = input.nextInt();
        System.out.println(setbit(n));
    }
    public static int noare(int n){
         int setbits = 0;
        while ( n > 0){
            if ((n & 1) == 1){
                setbits++ ;
            }
            n = n>> 1;

        }
        return setbits;
    }
    public static int setbit(int n){
        int count = 0;
        while (n > 0){
            count++;
            n-=(n & (-n));
        }
        return count;
    }
}
