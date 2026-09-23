public class BankAccountExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(2000.00);

        try {
            account.withdraw(5000.00);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
