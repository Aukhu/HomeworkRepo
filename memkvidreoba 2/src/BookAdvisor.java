import java.util.Random;

public class BookAdvisor extends Employee{
    private double adviseRating;
    private Library library;

    public BookAdvisor(String firstName, String lastName, String ID, double adviseRating, Library library) {
        super(firstName, lastName, ID);
        this.adviseRating = adviseRating;
        this.library = library;
    }

    public double getAdviseRating() {
        return adviseRating;
    }

    public void setAdviseRating(double adviseRating) {
        this.adviseRating = adviseRating;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Books adviseBook(){
        Books[] books = library.getBooks();

        Random random = new Random();

        int rand_index = random.nextInt(books.length);

        return books[rand_index];
    }
}
