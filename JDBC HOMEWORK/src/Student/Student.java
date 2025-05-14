package Student;

public class Student {
    private int id;
    private String first_name;
    private String last_name;
    private int grade;

    public Student(int id, String first_name, String last_name, int grade) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}