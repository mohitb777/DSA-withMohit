package Pratice3_Func_and_Methods;

public class blockandValueInsiligation {
    public static void main(String[] args) {
        int a = 20;
        int b= 30;
        {
            //int a = 100 It was not allow
            a =  100;//it aloow to reasign

            System.out.println(a);
            int c = 99 ;
            System.out.println(c);// Here allow
        }
       // System.out.println(c); cant call because out side the block
    }
}
