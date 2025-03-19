import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        List<Integer> numbers = Arrays.asList(15, 20, 5, 10, 25, 7, 4);
        int sum = numbers.stream()
                .filter(n -> n >= 10)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squared numbers >= 10: " + sum);

        //2
        List<String> words = Arrays.asList( "JavaScript", "Python", "Java", "C#", "C++" );
        List<String> filteredWords = words.stream()
                .filter(s -> s.startsWith("J"))
                .map(String::toUpperCase)
                .toList();

        System.out.println("Words that start with J (Uppercase): " + filteredWords);

        //3
        List<String> wordsToSort = Arrays.asList( "grape","kiwi" ,"apple", "banana", "orange" );
        List<String> sortedWords = wordsToSort.stream()
                .sorted()
                .toList();

        System.out.println("Sorted words stored in a list: " + sortedWords);

        //4
        List<Human> humans = Arrays.asList(
                new Human("Giorgi", 17),
                new Human("Levani", 13),
                new Human("Gocha", 21),
                new Human("Levani", 9)
        );
        List<Human> filteredHumans = humans.stream()
                .filter(h -> h.getAge() >= 15)
                .toList();
        boolean hasLevani = !filteredHumans.isEmpty() && filteredHumans.stream().map(Human::getName).toList().contains("Levani");

        System.out.println(hasLevani);

        //5
        List<Integer> nums = Arrays.asList( 10, 5, 20, 25, 15,  4, 7);
        List<Integer> sortedNums = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        Integer secondLargest = sortedNums.size() > 1 ? sortedNums.get(1) : null;
        System.out.println("Second largest number: " + secondLargest);
    }
}