public class Manager extends Employee {
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void displaySalary() {
        super.displaySalary();
        System.out.println(name + "'s bonus: KES " + bonus);
    }
}
