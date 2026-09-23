import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
    }
}
