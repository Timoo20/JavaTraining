public abstract class LibraryItem {
    String title;
    String itemId;
    private boolean borrowed;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.borrowed = false;
    }

    public abstract String getItemType();

    public void borrowItem() throws ItemNotAvailableException {
        if (borrowed) {
            throw new ItemNotAvailableException(title + " is already borrowed.");
        }
        borrowed = true;
    }

    public void displayDetails() {
        System.out.println(getItemType() + ": " + title + " (" + itemId + ")");
    }
}
