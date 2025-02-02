package Pratice5_Array_And_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(20);
        list.add(14);
        list.add(104);
        list.add(141);
        list.add(124);
        list.add(134);
        System.out.println(list.contains(141));
        list.set(0,54);
        list.remove(4);


        System.out.println(list);
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5 ; i++){
            System.out.println(list.get(i));
        }
    }
}
