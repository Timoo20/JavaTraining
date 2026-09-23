public class PhoneContact {
    String name;
    String phoneNumber;

    public PhoneContact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void call() {
        System.out.println("Calling " + name + " at " + phoneNumber + "...");
    }
}
