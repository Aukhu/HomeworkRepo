import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        // N2
        System.out.println("Employees whose names start with an 'A':");
        employeeList.stream()
                .filter(emp -> emp.getFirstName().startsWith("A"))
                .forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));

        // N3
        List<Employee> joinedIn2023 = employeeList.stream()
                .filter(emp -> emp.getId().startsWith("2023"))
                .toList();

        System.out.println("\nEmployees who joined in 2023:");
        joinedIn2023.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));

        // N4
        List<Employee> sortedEmployees = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName)
                        .thenComparing(Employee::getSalary))
                .toList();

        System.out.println("\nSorted Employees:");
        sortedEmployees.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + ", Salary: " + emp.getSalary()));
    }
}