import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1-b
        //2-a
        //3-a,b,d
        //4-b
        //5-a,c
        //6-d
        //7-c
        //8-b
        //9-b
        //10-c
        //11-c
        //12-b
        //13-a,b,c,d
        //14-b,d
        //15-b,c


        //16-17

        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("Students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0].trim());
                String firstName = parts[1].trim();
                String lastName = parts[2].trim();
                int year = Integer.parseInt(parts[3].trim());
                double grade = Double.parseDouble(parts[4].trim());
                List<String> subjects = Arrays.stream(parts[5].split(" "))
                        .map(String::trim)
                        .collect(Collectors.toList());
                Student student = new Student(id, firstName, lastName, year, grade, subjects);
                students.add(student);
            }
        } catch (IOException e) {
            System.out.println("Error reading file" + e.getMessage());
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Students.ser"))) {
            out.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error serializing students" + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Students.ser"))) {
            List<Student> deserializedStudents = (List<Student>) in.readObject();
            System.out.println("Deserialized students:");
            deserializedStudents.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error deserializing students: " + e.getMessage());
        }
        List<Student> deserializedStudents = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.ser"))) {
            deserializedStudents = (List<Student>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        deserializedStudents.sort(Student.SCORE_COMPARATOR);

        System.out.println("\nSorted Students by avgScore:");
        for (Student student : deserializedStudents) {
            System.out.println(student);

        }
    }
}