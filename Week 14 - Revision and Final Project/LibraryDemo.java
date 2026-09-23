import java.util.ArrayList;

public class LibraryDemo {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(new Book("Introduction to Java Programming", "B001"));
        items.add(new Magazine("Actuarial Insights Quarterly", "M001"));

        for (LibraryItem item : items) {
            item.displayDetails();
        }

        try {
            items.get(0).borrowItem();
            System.out.println(items.get(0).title + " borrowed successfully.");
            items.get(0).borrowItem();
        } catch (ItemNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
