public class PayableDemo {
    public static void main(String[] args) {
        Payable salaried = new SalariedEmployee(50000.00);
        Payable hourly = new HourlyEmployee(20, 500.00);

        System.out.println("Salaried pay: KES " + salaried.calculatePay());
        System.out.println("Hourly pay: KES " + hourly.calculatePay());
    }
}
