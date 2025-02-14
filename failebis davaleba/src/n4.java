import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class n4 {
    public static void main(String[] args) {
        String fileName1 = "src/Files/Sav4.txt";
        String fileName2 = "src/Files/Sav4b.txt";

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(fileName1)) ) {
            bw.write("Assure polite his real and other figures though. Day age advantages\n");
            bw.write("and sufficient eating expression traveling. Of on am father by agreed\n");
            bw.write("supply rather either. Own handsome delicate property mistresses her\n");
            bw.write("end appetite. Mean are sons too sold nor said. Son share three men\n");
            bw.write("power by you. Now merits wonder effect garret own.");
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2)) ){
            bw.write("Assure polite his real and other figures though. Day age advantages\n".toUpperCase());
            bw.write("and sufficient eating expression traveling. Of on am father by agreed\n".toUpperCase());
            bw.write("supply rather either. Own handsome delicate property mistresses her\n".toUpperCase());
            bw.write("end appetite. Mean are sons too sold nor said. Son share three men\n".toUpperCase());
            bw.write("power by you. Now merits wonder effect garret own.".toUpperCase());
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}