import java.util.ArrayList;
import java.util.HashMap;

public class Student implements Comparable<Student>{
    private String id;
    private String firstName;
    private String lastName;
    private HashMap<String, ArrayList<Integer>> subjectScores;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectScores = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<String, ArrayList<Integer>> getSubjectScores() {
        return subjectScores;
    }

    public void setSubjectScores(HashMap<String, ArrayList<Integer>> subjectScores) {
        this.subjectScores = subjectScores;
    }

    public void addScore(String subject, int score) {
        if (!subjectScores.containsKey(subject)) {
            subjectScores.put(subject, new ArrayList<>());
        }
        subjectScores.get(subject).add(score);
    }


    public double getAverageScore() {
        int totalScores = 0;
        int count = 0;
        for (ArrayList<Integer> scores : subjectScores.values()) {
            for (int score : scores) {
                totalScores += score;
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalScores / count;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAverageScore() > o.getAverageScore()) {
            return 1;
        } else if (this.getAverageScore() < o.getAverageScore()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getLastName() {
        return lastName;
    }
}
