import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Student[] array = new Student[5];

        for (int i = 0; i<5; i++) {
            System.out.println("Enter details for Student " + (i + 1));

            Student students = new Student();

            System.out.print("Enter name: ");
            students.setName(scanner.nextLine());

            System.out.print("Enter surname: ");
            students.setSurname(scanner.nextLine());

            System.out.print("Enter age: ");
            students.setAge(scanner.nextInt());

            System.out.print("Enter course: ");
            students.setCourse(scanner.nextInt());

            System.out.print("Enter GPA: ");
            students.setGpa(scanner.nextDouble());

            scanner.nextLine();

            array[i] = students;
        }

        System.out.println("Student with highest GPA is: "+highestGpa(array));
    }

    // N3

    public static String highestGpa(Student[] arr){
        int index = 0;

        for(int i = 1; i<5; i++){
            if(arr[i].getGpa()>arr[index].getGpa()) index = i;
        }

        return arr[index].getName() + " " + arr[index].getSurname();
    }
}