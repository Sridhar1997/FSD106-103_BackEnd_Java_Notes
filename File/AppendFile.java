
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

    public static void main(String[] args) {
        try {
            FileWriter answer = new FileWriter("CSZ.txt", true);
            answer.write("\n Happy Learning");
            answer.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }

}
