import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class n1 {
    public static void main(String[] args) {
        String fileName = "src/Files/Vefxistyaosani.txt";

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)) ) {
            bw.write("შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა გორი,\n");
            bw.write("კაცი კაცსა შემოვსტყორცი, ცხენ-კაცისა დავდგი გორი;\n");
            bw.write("კაცი, ჩემგან განატყორცი ბრუნავს ვითა ტანაჯორი,\n");
            bw.write("ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი.");
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
