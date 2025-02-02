package Pratice11_Recursion;

public class firstrecursion_program {
    public static void main(String[] args) {
        print (1);
    }
    static void print(int n){
        if (n > 6){
            return;
        }
        System.out.println(n);
        print(n+n);
    }

}
