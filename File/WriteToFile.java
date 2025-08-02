
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        try {
            FileWriter answer = new FileWriter("CSZ.txt");
            answer.write("Hi Welcome to Credo Systemz - Back End Web Development");
            answer.close();
            System.out.println("Successfully Wrote to the File");
        } catch (IOException e) {
            System.out.println("An Error Occurred");
        }

    }

}
