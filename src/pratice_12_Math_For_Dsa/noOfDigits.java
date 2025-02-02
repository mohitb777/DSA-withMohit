package pratice_12_Math_For_Dsa;

import java.util.Scanner;

public class noOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n for which u want to fing how many time its run");
        int n = input.nextInt();
        System.out.println("Enter the base on which base u have to find");
        int b = input.nextInt();
        System.out.println(noare(n,b));
    }
    public static int noare(int n,int base){
        int ans = (int)((Math.log(n)/Math.log(base))  +1);
        return ans ;
    }
}
