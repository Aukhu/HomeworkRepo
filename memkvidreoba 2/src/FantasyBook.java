public class FantasyBook extends Books{
    private String country;

    public FantasyBook(String title, int pages, String author, boolean isSolidCover, String country) {
        super(title, pages, author, isSolidCover);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() + ", Country: " + country;
    }
}