package pratice4shadowing_varargs_funoverloading_and_etc;

import java.util.Arrays;

public class varlenarg {
    public static void main(String[] args) {
        fun(2,4,5,5,6,7,6,8,4,0);
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
