package nomeri4;

public class SalariedEmployee extends Employee{
    private double salary ;
    public SalariedEmployee(String firstName, String lastName, String mobileNumber , double salary) {
        super(firstName, lastName, mobileNumber);
        this.salary = salary ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double Salary() {
        return salary ;
    }
}
