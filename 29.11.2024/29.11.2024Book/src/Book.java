public class Book {
        String name ;
        String author ;
        int pages ;

        public Book(String name , String author, int pages ){
            this.name = name ;
            this.author = author ;
            this.pages = pages ;
        }

        public Book(){
            this.name= "Harry Potter";
            this.author = "Joanne Rowling";
            this.pages = 0 ;
        }

        void displayBookInfo(){
            System.out.println("The book name is: " + name);
            System.out.println("The book author is: " + author);
            System.out.println("The number of pages in the book is: " + pages);
        }

}
