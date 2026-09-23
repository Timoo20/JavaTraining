import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual Rate (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (years): ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The simple interest is: KES " + simpleInterest);
    }
}
