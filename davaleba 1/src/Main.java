
import nomeri1.Book;
import nomeri1.Writer;
import nomeri2.Fraction;
import nomeri3.QuadraticEquation;

public class Main {
    public static void main(String[] args) {
        Writer writer1 = new Writer("გიორგი", "ბაკურაძე");
        Writer writer2 = new Writer("ანა", "პეტრაშვილი");

        Book book1 = new Book("ქართული ლიტერატურა", 320, "ლიტერატურა", writer1);
        Book book2 = new Book("ფსიქოლოგია", 200, "მეცნიერება", writer2);
        Book book3 = new Book("ფსიქოლოგია", 200, "მეცნიერება", writer2);

        Book[] books = {book1, book2, book3};
        for (Book book : books) {
            System.out.println(book);
        }

        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 4);
        Fraction fraction3 = new Fraction(1, 2);
        Fraction fraction4 = new Fraction(3, 4);

        Fraction[] fractions = {fraction1, fraction2, fraction3, fraction4};
        int equalCount = 0;

        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }

        for (int i = 0; i < fractions.length; i++) {
            for (int j = i + 1; j < fractions.length; j++) {
                if (fractions[i].equals(fractions[j])) {
                    equalCount++;
                }
            }
        }

        System.out.println("წილადების რაოდენობა, რომლებიც ერთმანეთის ტოლია: " + equalCount);

        // 3. კვადრატული განტოლებების ინიციალიზაცია
        QuadraticEquation equation1 = new QuadraticEquation(1, -5, 6);
        QuadraticEquation equation2 = new QuadraticEquation(1, -3, 2);
        QuadraticEquation equation3 = new QuadraticEquation(1, -5, 6);

        QuadraticEquation[] equations = {equation1, equation2, equation3};
        int equalEquationsCount = 0;

        for (QuadraticEquation equation : equations) {
            System.out.println(equation);
        }

        for (int i = 0; i < equations.length; i++) {
            for (int j = i + 1; j < equations.length; j++) {
                if (equations[i].equals(equations[j])) {
                    equalEquationsCount++;
                }
            }
        }

        System.out.println("კვადრატული განტოლებების რაოდენობა, რომლებიც ტოლფასია: " + equalEquationsCount);
    }
}

