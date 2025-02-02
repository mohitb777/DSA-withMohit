
package pratice6_Linear_Serch;

public class linerserchwithstring {
    public static void main(String[] args) {
        String name = "jayshreeram";
        char target = 'h';
        System.out.println( linearSerch(name, target));
    }

    static boolean linearSerch(String str, char target) {
        if (str.length() == 0) {
            return false;

        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)){
                return true ;
            }
        }
        return false;
    }
}
