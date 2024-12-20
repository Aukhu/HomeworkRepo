public class AdventureBook extends Books {
    private String country;

    public AdventureBook(String title, int pages, String author, boolean isHardCover) {
        super(title, pages, author, isHardCover);
        this.country= country;
    }
}
