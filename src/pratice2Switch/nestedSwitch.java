package pratice2Switch;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String depertment = in.next();

        switch (empid){
            case 1 :
                System.out.println("xyz");
                break;
            case 2 :
                System.out.println("abc");
                break;
            case 3 :
                switch (depertment) {
                    case "IT" -> System.out.println("itdep");
                    case "MBA" -> System.out.println("MBAdep");
                    default -> System.out.println("No dep");
                }
            default:
                System.out.println("Enter the correct dep");

        }
    }
}
/*
 int empid = in.nextInt();
        String depertment = in.next();

        switch (empid){
            case 1 :
                System.out.println("xyz");
                break;
            case 2 :
                System.out.println("abc");
                break;
            case 3 :
                switch (depertment) {
                    case "IT":
                        System.out.println("itdep");
                        break;
                    case "MBA":
                        System.out.println("MBAdep");
                        break;
                    default:
                        System.out.println("No dep");
                }
            default:
                System.out.println("Enter the correct dep");

        }

 */