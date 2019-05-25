import java.util.InputMismatchException;
import java.util.Scanner;

class TestExceptionHandling {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        try {
            System.out.println("Enter Num 1: ");
            num1 = scan.nextInt();
            System.out.println("Enter Num 1: ");
            num2 = scan.nextInt();
        } catch (InputMismatchException obj1) {
            System.out.println("You most provide an Integer");
        }
        // throw ArithmeticException;
        try {
            int answ = num1 / num2;
            System.out.println("The answer is: " + answ);
        } catch (ArithmeticException obj) {
            System.out.println("You are trying to divide by zero");

        }
        scan.close();
    }

}