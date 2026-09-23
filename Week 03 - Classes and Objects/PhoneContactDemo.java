public class PhoneContactDemo {
    public static void main(String[] args) {
        PhoneContact contact1 = new PhoneContact("Brian Otieno", "0722111222");
        PhoneContact contact2 = new PhoneContact("Faith Achieng", "0733444555");
        PhoneContact contact3 = new PhoneContact("Kevin Mutua", "0711888999");

        contact1.call();
        contact2.call();
        contact3.call();
    }
}
