import java.util.Scanner;

public class RevisionExamples {
    public static void main(String[] args) {
        System.out.println("Name: Tim Murkomen");
        System.out.println("Registration Number: S13/00000/20");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
    }
}
