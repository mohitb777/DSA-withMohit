package Pratice_16_Recursion_Pattern_And_Bubble_selection_Merge_Quick_SortingAlgo;

import java.util.Scanner;

public class PatternWithRN {

        public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            int row = input.nextInt();
            int col = input.nextInt();
             triangle2(row,col);
        }
        static void triangle(int r, int c){
            if ( r == 0){
                return;
            }
            if (c<r){
                System.out.print("*");
                triangle(r,c+1);
            }else {
                System.out.println();
                triangle(r-1, 0);
            }
        }

    static void triangle2(int r, int c){
        if ( r == 0){
            return;
        }
        if (c<r){

            triangle2(r,c+1);
            System.out.print("*");
        }else {
            triangle2(r-1, 0);
            System.out.println();

        }
    }

}
