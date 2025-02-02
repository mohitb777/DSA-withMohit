package pratice_12_Math_For_Dsa;
import java .util. Scanner;
public class OddEven {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
