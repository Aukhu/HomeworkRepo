import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Human person1 = new Human(firstName, lastName, age);

        System.out.print("Enter second person's first name: ");
        String secondPersonFirstName = scanner.nextLine();

        System.out.print("Enter second person's last name: ");
        String secondPersonLastName = scanner.nextLine();

        System.out.print("Enter second person's age: ");
        int secondPersonAge = scanner.nextInt();
        scanner.nextLine();


        Human person2 = new Human(secondPersonFirstName, secondPersonLastName, secondPersonAge);

        person1.Walk();
        person1.HangOut(secondPersonFirstName);

    }
}