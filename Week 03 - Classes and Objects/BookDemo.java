public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Correlation and Regression Analysis", "J. Otieno", 1200.00);
        Book book2 = new Book("Introduction to Java Programming", "Daniel Liang", 2500.00);
        Book book3 = new Book("Financial Mathematics", "A. Wanjiru");

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
