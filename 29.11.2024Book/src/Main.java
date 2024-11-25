public class Main {

    public static void main(String[] args) {

        Book myBook= new Book();

        System.out.println(myBook.name);
        System.out.println(myBook.author);
        System.out.println(myBook.pages);
        System.out.println();

        myBook.displayBookInfo();

    }
}