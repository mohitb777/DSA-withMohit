package pratice4shadowing_varargs_funoverloading_and_etc;

public class functionOverloading {
    public static void main(String[] args) {
fun("MADA");
fun(420);
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun ( String a){
        System.out.println(a);
    }
}
