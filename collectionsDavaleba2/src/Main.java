import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "banana", "pineapple", "orange", "apple"};
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println(wordCount);

        // N2-N3-N4

        Student s1 = new Student("1", "Avto", "Ukhurhunashvili");
        Student s2 = new Student("2", "Nana", "Mchedlishvili ");
        Student s3 = new Student("3", "Irakli", "Kupatadze");
        Student s4 = new Student("4", "Mishiko", "Tatqaridze");
        Student s5 = new Student("5", "Elene", "Wowoleishvili");
        Student s6 = new Student("6", "Alika", "Koshadze");

        s1.addScore("Mathematics", 100);
        s1.addScore("Mathematics", 90);
        s1.addScore("Georgian", 86);

        s2.addScore("Mathematics", 95);
        s2.addScore("Georgian", 89);

        s3.addScore("Mathematics", 90);
        s3.addScore("Georgian", 87);

        s4.addScore("Mathematics", 90);
        s4.addScore("Georgian", 90);

        s5.addScore("Mathematics", 85);
        s5.addScore("Georgian", 90);

        s6.addScore("Mathematics", 80);
        s6.addScore("Georgian", 90);

        List<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5, s6));

        Collections.sort(students);
        Collections.reverse(students); // maglidan dablisken ro moyves

        System.out.println("Students sorted by average score:");
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " - Average: " + s.getAverageScore());
        }

        students.sort(new StudentLastNameComparator());
        System.out.println("\nStudents sorted by last name:");
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
    }
}