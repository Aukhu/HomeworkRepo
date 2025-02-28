import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //1
//        ArrayList<Integer>numbers = new ArrayList<>() ;
//
//        Random random = new Random();
//
//        while (true) {
//            int num = random.nextInt(51);
//            numbers.add(num);
//            if (numbers.size() == 40) break;
//        }
//        System.out.println(numbers.size());
//        System.out.println(numbers);
//
//        for (int i = 0; i <40; i++) {
//            if(numbers.get(i) %2!=0){
//                System.out.print(numbers.get(i) + ", ");
//            }
//        }

        //2
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 25, 2, 4, 11, 87));
//
//        System.out.println(numbers);
//
//        System.out.print("List of {");
//
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i));
//            if (i < numbers.size() - 1) {
//                System.out.print(", ");
//            }
//        }
//
//        System.out.println("}");

        //3
//        int[] array = new int[5];
//
//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(51);
//        }
//
//        ArrayList<Integer>list = new ArrayList<>();
//
//        for(int num : array) {
//            list.add(num);
//        }
//        int maxIndex = 0 ;
//
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) > maxIndex){
//                maxIndex = list.get(i) ;
//            }
//        }
//        System.out.print("List of {");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//            if (i < list.size() - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.print("}");
//        System.out.println();
//        System.out.println("Highest number of list is :" + maxIndex);

        //4

        Library library = new Library();
        library.populateList("src/books.txt");
        library.printBooks();

        }
    }
