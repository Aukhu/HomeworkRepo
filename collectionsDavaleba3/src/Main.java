import java.util.*;

public class Main {
    public static void main(String[] args) {
        //n1
        ArrayList<BasketballPlayer> players = new ArrayList<>();
        players.add(new BasketballPlayer("Kobe", "Bryant", 40, 5, 4, 6, 2));
        players.add(new BasketballPlayer("Kevin", "Durant", 33, 7, 3, 8, 1));
        players.add(new BasketballPlayer("Nikola", "Jokic", 28, 15, 10, 4, 3));

        players.sort(Comparator.comparingDouble(BasketballPlayer::getRating).reversed());
        System.out.println("Basketball Players (Descending): " + players);
        Collections.reverse(players);
        System.out.println("Basketball Players (Ascending): " + players);

        System.out.println("\n\n---------------------\n\n");

        //n2
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("David", "Khutsishvili", new GregorianCalendar(2003, Calendar.FEBRUARY, 15).getTime(), new ArrayList<>(Arrays.asList(3.6, 3.8, 3.7))));
        students.add(new Student("Sandro", "Gelashvili", new GregorianCalendar(2005, Calendar.MAY, 22).getTime(), new ArrayList<>(Arrays.asList(3.9, 4.0, 3.8))));
        students.add(new Student("Elene", "Kvanchiani", new GregorianCalendar(2004, Calendar.SEPTEMBER, 10).getTime(), new ArrayList<>(Arrays.asList(3.5, 3.7, 3.6))));

        System.out.println("Students (Unsorted): " + students);
        students.sort(Comparator.comparing(Student::getLastName));
        System.out.println("Students (Lexically Sorted): " + students);
        students.sort(Comparator.comparingDouble(Student::getGPA).reversed());
        System.out.println("Students (Sorted by GPA): " + students);
        students.sort(Comparator.comparing(Student::getBirthDate));
        System.out.println("Students (Sorted by DOB): " + students);

        System.out.println("\n\n---------------------\n\n");

        //n3
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Bugatti", "Chiron", 2022, 8000, new Engine("Gasoline", 16, 8.0)));
        cars.add(new Car("McLaren", "720S", 2020, 14000, new Engine("Gasoline", 8, 4.0)));
        cars.add(new Car("Aston Martin", "DB11", 2019, 20000, new Engine("Gasoline", 12, 5.2)));

        System.out.println("Cars (Unsorted):\n");
        cars.forEach(System.out::println);
        System.out.println();

        cars.sort(Comparator.comparingInt(Car::getYear));
        System.out.println("Cars (Sorted by Year):\n");
        cars.forEach(System.out::println);
        System.out.println();

        cars.sort(Comparator.comparingInt(Car::getMileage));
        System.out.println("Cars (Sorted by Mileage):\n");
        cars.forEach(System.out::println);
        System.out.println();

        cars.sort(Comparator.comparingDouble(car -> car.getEngine().getDisplacement()));
        System.out.println("Cars (Sorted by Engine Displacement):\n");
        cars.forEach(System.out::println);
    }
}