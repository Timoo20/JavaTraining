public class HourlyEmployee implements Payable {
    double hoursWorked;
    double hourlyRate;

    public HourlyEmployee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}
