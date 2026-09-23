public class Magazine extends LibraryItem {
    public Magazine(String title, String itemId) {
        super(title, itemId);
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }
}
