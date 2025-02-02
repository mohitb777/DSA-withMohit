package pratice1_basic;

import java.util.Scanner;

public class basiclooping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        System.out.println("Enter the third number");
        int c = in.nextInt();
        //find the largest of three
      //  int max = a;
        //if (b > max) {
          //  max = b;
        //}
        //if(c > max) {
          //  max = c;
        //}
        //System.out.println("TO sabse bada number hai   " + max);
           int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
