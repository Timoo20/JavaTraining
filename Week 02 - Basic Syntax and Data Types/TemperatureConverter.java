import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
    }
}
