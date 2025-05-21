import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/login",
                "postgres",
                "admin"
        );

        Connection connection = dcm.getConnection();

        UserDao userDao = new UserDaoImpl();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    register();
                    break;
                case "2":
                    login();
                    break;
                case "3":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Registration ---");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        boolean success = UserService.registerUser(username, password, firstName, lastName);
        if (success) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Username already taken. Try again.");
        }
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Login ---");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = UserService.login(username, password);
        if (user != null) {
            System.out.println("Login successful. Welcome, " + user.getFirstName() + "!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}