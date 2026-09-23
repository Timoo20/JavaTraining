import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int number;

        System.out.println("Enter numbers to add. Enter 0 to stop.");

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            total += number;
        } while (number != 0);

        System.out.println("Total: " + total);
    }
}
