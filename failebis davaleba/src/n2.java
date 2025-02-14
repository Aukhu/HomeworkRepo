import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class n2 {
    public static void main(String[] args) {
        String fileName = "src/Files/Vefxistyaosani.txt";

        try ( BufferedReader br = new BufferedReader(new FileReader(fileName)) ) {
            String line;
            int words = 0;

            while((line = br.readLine()) != null){
                words++;

                for(char c : line.toCharArray()){
                    if(c == ' ') words++;
                }
            }

            System.out.println(words);

        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}