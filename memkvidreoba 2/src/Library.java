public class Library {
    private Employee[] employees;
    private Books[] books;
    private String firstName ;
    private int empIndex;
    private int bookIndex;

    public Library(String firstName) {
        this.firstName = firstName;
        this.employees = new Employee[10];
        this.books = new Books[10];
        this.empIndex = 0;
        this.bookIndex = 0;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        if(empIndex == employees.length){
            increaseEmpSize();
        }

        employees[empIndex++] = employee;
    }

    public void addBook(Books book) {
        if(bookIndex == books.length){
            increaseBookSize();
        }

        books[bookIndex++] = book;
    }

    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = firstName;
    }


    private void increaseEmpSize(){
        Employee[] newEmp = new Employee[employees.length + 5];

        for(int i = 0; i<employees.length; i++){
            newEmp[i] = employees[i];
        }

        employees = newEmp;
    }

    private void increaseBookSize(){
        Books[] newBook = new Books[books.length + 5];

        for(int i = 0; i<books.length; i++){
            newBook[i] = books[i];
        }

        books = newBook;
    }

    public <Bookkeeper> void addEmployee(Bookkeeper) {
    }
}
