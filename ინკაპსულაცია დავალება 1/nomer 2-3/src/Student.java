public class Student {
    private String name ;
    private String surname ;
    private int age ;
    private int course ;
    private double gpa ;

    public void setName(String name){
        this.name = name ;
    }
    public void setSurname(String surname){
        this.surname = surname ;
    }
    public void setAge (int age){
        this.age = age ;
    }
    public void setCourse(int course){
        this.course = course ;
    }
    public void setGpa(double gpa){
        this.gpa =gpa ;
    }

    public String getName() {
        return name ;
    }
    public String getSurname() {
        return surname ;
    }
    public int getAge() {
        return age;
    }
    public int getCourse() {
        return course;
    }
    public double getGpa() {
        return gpa;
    }
}
