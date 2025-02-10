package Pratice_17_Recursion_Subset_Subsequence_String_Questions;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
      //  subseq("", "abc");
        System.out.println(subseqRET("","abc"));
       // subseqwithaski("","abc");
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));

    }

    ///////////Same with Array List///////////////
    static ArrayList<String> subseqRET(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqRET(p + ch, up.substring(1));
        ArrayList<String> right = subseqRET(p, up.substring(1));
        left.addAll(right);
        return left;

    }
    static void subseqwithaski(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqwithaski(p + ch, up.substring(1));
        subseqwithaski(p, up.substring(1));
        subseqwithaski(p + (ch + 0), up.substring(1));


    }
}