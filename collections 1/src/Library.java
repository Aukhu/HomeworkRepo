import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() { return books; }
    public void setBooks(ArrayList<Book> books) { this.books = books; }

    public void populateList(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" "); // strings (line)s dayofs space-it (pythonidan)
                if (parts.length == 2) {
                    books.add(new Book(parts[0], Integer.parseInt(parts[1]))); // str -> int
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}