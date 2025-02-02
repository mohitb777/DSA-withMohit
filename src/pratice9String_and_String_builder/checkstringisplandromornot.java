package pratice9String_and_String_builder;

import java.sql.SQLOutput;

public class checkstringisplandromornot {
    public static void main(String[] args) {
            String str = "csvsvsv";
        System.out.println(ispalindeome(str));
    }
    static boolean ispalindeome(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length() /2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end){
                return false;
            }
         }
        return true;
    }
}
