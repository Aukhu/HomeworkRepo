public class ScienceBook extends Books{
    private String scienceSubject;

    public ScienceBook(String title, int pages, String author, boolean isSolidCover, String scienceSubject) {
        super(title, pages, author, isSolidCover);
        this.scienceSubject = scienceSubject;
    }

    public String getScienceSubject() {
        return scienceSubject;
    }

    public void setScienceSubject(String scienceSubject) {
        this.scienceSubject = scienceSubject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Science Subject: " + scienceSubject;
    }
}
