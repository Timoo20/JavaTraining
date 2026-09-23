public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author) {
        this(title, author, 0.0);
    }

    public void displayDetails() {
        System.out.println(title + " by " + author + " - KES " + price);
    }
}
