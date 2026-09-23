public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.00);

        account.deposit(1500.00);
        account.withdraw(2000.00);

        System.out.println("Final balance: KES " + account.getBalance());
    }
}
