
import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        try {
            File answer = new File("CSZ1.txt");
            if (answer.createNewFile()) {
                System.out.println("File Created " + answer.getName());
            } else {
                System.out.println("File Already Exists.");
            }
        } catch (IOException e) {
            System.out.println("An Error Occurred");
        }
    }
}
