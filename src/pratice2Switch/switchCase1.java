package pratice2Switch;
import java.util.Scanner;
public class switchCase1 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   /* String fruit = input.next();
    switch (fruit) {
        case "mango" -> System.out.println("king of frout");
        case "apple" -> System.out.println("mahanga");
        case "orange" -> System.out.println("Sasta");
        case "graps" -> System.out.println("Chota");
        default -> System.out.println("invilid entry");
    */
        int day = input.nextInt();
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thuesday");
            break;
        case 5:
            System.out.println("friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("sunday");
            break;
        default:
            System.out.println("Mazak chal raha hai kya");
            break;
    }
   }

}
