import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static final String filename = "phonebook.ser";

    public static void saveContacts(List<PhoneContact> contacts) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static List<PhoneContact> loadContacts() {
        File file = new File(filename);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<PhoneContact>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
            return new ArrayList<>();
        }
    }
}
