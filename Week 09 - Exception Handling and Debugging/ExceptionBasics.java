import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int first = input.nextInt();

            System.out.print("Enter the second number: ");
            int second = input.nextInt();

            int result = first / second;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Please enter whole numbers only.");
        } finally {
            System.out.println("Calculation attempt finished.");
        }
    }
}
