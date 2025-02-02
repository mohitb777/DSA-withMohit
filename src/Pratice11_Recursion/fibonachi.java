package Pratice11_Recursion;

public class fibonachi {
    public static void main(String[] args) {
     //   int r  =  fibo(4);
       // System.out.println(r);
        System.out.println(fiboformula(999999999));
    }
    static long fiboformula (long n){
        return(long) (Math.pow(((1 + Math.sqrt(5))/2) , n));
    }
    static int fibo(int n){
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
