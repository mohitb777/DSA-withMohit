package Pratice_17_Recursion_Subset_Subsequence_String_Questions;

public class Skip_A_Char {
    public static void main(String[] args) {
        //  skip("","baczdcaa");
        System.out.println(skip2("abgdaga"));
        System.out.println(SkipPhone("abgphonedaga"));
        System.out.println(SkipPhoneNotpho("abgphondaga"));
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {

            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    ////////////by second approach////////////////
    static String skip2(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return up.charAt(0) + skip2(up.substring(1));
        }
    }

    static String SkipPhone(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("phone")){
            return SkipPhone(up.substring(5));
        } else {
            return up.charAt(0) + SkipPhone(up.substring(1));
        }
    }

    static String SkipPhoneNotpho(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("pho") && !up.startsWith("phone")){
            return SkipPhoneNotpho(up.substring(3));
        } else {
            return up.charAt(0) + SkipPhoneNotpho(up.substring(1));
        }
    }

    public static class subsetwithoutRE {
        public static void main(String[] args) {

        }
    }
}

