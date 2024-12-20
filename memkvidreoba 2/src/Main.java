import java.awt.print.Book;

public class Main {
    public static <Bookkeeper> void main(String[] args) {
        Library library = new Library("State Library");

        BookAdvisor employee1 = new BookAdvisor("Avto", "Ukhurgunashvilli", "188", 10, library);
        Bookkeeper employee2 = new Bookkeeper("irakli", "gabashvili", "1854");
        BookGiver employee3 = new BookGiver("Zaliko", "Rustaveli", "318", "9", "11");
        BookController employee4 = new BookController("giorgi" ,"Metreveli", "84");

        library.addEmployee(employee1);
        library.addEmployee(employee2);
        library.addEmployee(employee3);
        library.addEmployee(employee4);

        AdventureBook book1 = new AdventureBook("The Hobbit", 310, "J.R.R. Tolkien", true);
        ScienceBook book2 = new ScienceBook("A Brief History of Time", 256, "Stephen Hawking", false, "Physics");
        FantasyBook book3 = new FantasyBook("Percy Jackson", 400, "Rick Riordan", true, "Greek");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        // -------

        Books recommendedBook = employee1.adviseBook();

        while (recommendedBook == null) {
            recommendedBook = employee1.adviseBook();
        }

        System.out.println("Recommended book: " + recommendedBook);
    }
}