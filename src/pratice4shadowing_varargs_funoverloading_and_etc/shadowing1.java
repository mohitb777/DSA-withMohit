package pratice4shadowing_varargs_funoverloading_and_etc;

public class shadowing1 {
    static int x = 30 ;//shadow at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x ;
        //System.out.println(x);scope is only begin when the value is inisilised
        x = 40;
        System.out.println(x);
        fun();



    }
    static void fun() {
        System.out.println(x);
    }
}
