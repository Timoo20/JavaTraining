public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3));       // uses add(int, int)
        System.out.println(calculator.add(2.5, 3.5));    // uses add(double, double)
        System.out.println(calculator.add(1, 2, 3));     // uses add(int, int, int)
    }
}
