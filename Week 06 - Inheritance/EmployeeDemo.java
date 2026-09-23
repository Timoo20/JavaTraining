public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice Mumbi", 45000.00);
        Manager manager = new Manager("Brian Odhiambo", 80000.00, 15000.00);

        employee.displaySalary();
        manager.displaySalary();
    }
}
