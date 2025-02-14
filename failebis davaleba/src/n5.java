import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class n5 {
    public static void main(String[] args) {
        String fileName1 = "src/Files/Sav5f.txt";
        String fileName2 = "src/Files/Sav5s.txt";
        String fileName0 = "src/Files/Sav5.txt";

        StringBuilder f1Info = new StringBuilder();
        StringBuilder f2Info = new StringBuilder();

        try ( BufferedReader br = new BufferedReader(new FileReader(fileName1)) ){
            String line;

            while((line = br.readLine()) != null){
                f1Info.append(line);
            }
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

        try ( BufferedReader br = new BufferedReader(new FileReader(fileName2)) ){
            String line;

            while((line = br.readLine()) != null){
                f2Info.append(line);
            }
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(fileName0)) ) {
            bw.write("first file\n");
            bw.write(String.valueOf(f1Info));
            bw.newLine();
            bw.newLine();
            bw.write("second file\n");
            bw.write(String.valueOf(f2Info));
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}