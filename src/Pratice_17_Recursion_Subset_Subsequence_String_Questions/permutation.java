package Pratice_17_Recursion_Subset_Subsequence_String_Questions;

public class permutation
{
    public static void main(String[] args) {
    //permutations("","abc");
        System.out.println(permutationscount("","abc"));
    }
    static void permutations (String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    static int permutationscount (String p , String up){
        if (up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           count = count + permutationscount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
