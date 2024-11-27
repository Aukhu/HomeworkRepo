import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the book name: ");
        String name =scanner.nextLine();

        System.out.println("Enter the book author");
        String author = scanner.nextLine();

        System.out.println("Enter the number of book pages");
        int pages = scanner.nextInt();

        Book myBook= new Book(name, author , pages);

        myBook.displayBookInfo();

        System.out.println();

        //2

        Book myBook2 = new Book();

        myBook2.displayBookInfo();

    }
}