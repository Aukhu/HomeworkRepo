import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String firstName, lastName;
    private Date birthDate;
    private ArrayList<Double> grades;

    public Student(String firstName, String lastName, Date birthDate, ArrayList<Double> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.grades = grades;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }


    public double getGPA() {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public String toString() {
        return firstName + " " + lastName + " - GPA: " + getGPA();
    }
}
