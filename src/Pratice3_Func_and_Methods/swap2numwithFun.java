package Pratice3_Func_and_Methods;

import java.util.Scanner;

public class swap2numwithFun {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        swap(a,b);

        System.out.println(a + " " + b);
    }
    static void swap (int x, int y) {//both are pointing to the same object thats why it did  not swap because we are not swaping we are creating the new object
        int temp = x;
        x = y;
        y= temp;
    }
}
