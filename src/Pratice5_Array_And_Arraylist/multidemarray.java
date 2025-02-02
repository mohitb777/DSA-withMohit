package Pratice5_Array_And_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class multidemarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //  int[][] arr  = {
        //        {1,2,6,},
        //      {5,8,9,7},
        //    {2,8,},

        //};
        int[][] arr = new int[3][3];
        //System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
                //System.out.println(arr[row][col] + " ");
            }
        }
            for (int row = 0; row < arr.length; row++) {
                System.out.println(Arrays.toString(arr[row]));

            }

        }
    }
