public class Library {
    private int ID ;
    private String name ;

    public Library(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void PrintInfo(){
        System.out.println("Library ID: " + ID);
        System.out.println("Library Name: " + name);

        Book book = new Book(101, "The Great Gatsby");
        book.printBookInfo();
    }

    public class Book {
        private int bookId;
        private String bookName;

        public Book(int bookId, String bookName) {
            this.bookId = bookId;
            this.bookName = bookName;
        }

        public void printBookInfo() {
            System.out.println("Book ID: " + bookId);
            System.out.println("Book Name: " + bookName);
        }
    }
}
