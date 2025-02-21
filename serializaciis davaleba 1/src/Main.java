import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        Country[] countries = new Country[5];

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Enter information for country #" + (i + 1));

            System.out.print("Enter country name: ");
            String name = scanner.nextLine();

            System.out.print("Enter population: ");
            long population = scanner.nextLong();

            System.out.print("Enter area in square kilometers: ");
            double area = scanner.nextDouble();
            scanner.nextLine();

            countries[i] = new Country(name, population, area);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("countries.txt"))) {
            oos.writeObject(countries);
            System.out.println("Countries data has been serialized and saved to countries.txt.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("countries.txt"))) {
            Country[] deserializedCountries = (Country[]) ois.readObject();
            System.out.println("\nDeserialized Countries:");
            for (Country country : deserializedCountries) {
                System.out.println(country);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}