public class Book extends LibraryItem {
    public Book(String title, String itemId) {
        super(title, itemId);
    }

    @Override
    public String getItemType() {
        return "Book";
    }
}
