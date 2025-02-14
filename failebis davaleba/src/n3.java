import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = "src/Files/Vefxistyaosani.txt";

        try ( BufferedReader br = new BufferedReader(new FileReader(fileName)) ) {
            String line;
            String word = scanner.nextLine();

            while((line = br.readLine()) != null){
                if(line.contains(word) && !word.contains(" ") && !word.contains(",") && !word.contains(".") && !word.contains(";")){
                    System.out.println("The file contains the word: '"+word+"'");
                    return;
                }
            }

            System.out.println("There is not any word '"+word+"' in a file");
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}