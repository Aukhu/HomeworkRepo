import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private double grade;
    private List<String> subjects;
    private double avgScore;

    public Student(int id, String firstName, String lastName, int year, double grade, List<String> subjects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.grade = grade;
        this.subjects = new ArrayList<>(subjects);
        Collections.sort(this.subjects);
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", grade=" + grade +
                ", subjects=" + subjects +
                ", avgScore=" + avgScore +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.id == other.id && this.subjects.equals(other.subjects);
    }

    public int hashCode() {
        return Objects.hash(id , avgScore , subjects);
    }

    public static final java.util.Comparator<Student> SCORE_COMPARATOR = (s1, s2) -> Double.compare(s1.avgScore, s2.avgScore);
}
