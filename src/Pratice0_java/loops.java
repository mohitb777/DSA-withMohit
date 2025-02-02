package Pratice0_java;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

while (x <= y){
    System.out.println(x);
    x=x+2;
}
//Do while loop
 x = 1;
do{
    System.out.println(x);
    x++;
}while (x <= y);
    }
}