import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MAX_CONTACTS = 30;
    private static List<PhoneContact> contacts = Data.loadContacts();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // inf loop
            System.out.println("\nPhonebook Menu:" +
                    "\n1. Add Contact" +
                    "\n2. Delete Contact" +
                    "\n3. Edit Contact" +
                    "\n4. View Contacts" +
                    "\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (contacts.size() >= MAX_CONTACTS) {
                        System.out.println("Phonebook is full!");
                        break;
                    }
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    contacts.add(new PhoneContact(firstName, lastName, phoneNumber, email));
                    Data.saveContacts(contacts);
                    break;
                case 2:
                    System.out.print("Enter Phone Number to Delete: ");
                    phoneNumber = scanner.nextLine();
                    contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
                    Data.saveContacts(contacts);
                    break;
                case 3:
                    System.out.print("Enter Phone Number to Edit: ");
                    phoneNumber = scanner.nextLine();
                    for (PhoneContact contact : contacts) {
                        if (contact.getPhoneNumber().equals(phoneNumber)) {
                            System.out.print("Enter New First Name: ");
                            contact.setFirstName(scanner.nextLine());
                            System.out.print("Enter New Last Name: ");
                            contact.setLastName(scanner.nextLine());
                            System.out.print("Enter New Email: ");
                            contact.setEmail(scanner.nextLine());
                            Data.saveContacts(contacts);
                            break;
                        }
                    }
                    break;
                case 4:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        for (PhoneContact contact : contacts) {
                            System.out.println(contact);
                        }
                    }
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}