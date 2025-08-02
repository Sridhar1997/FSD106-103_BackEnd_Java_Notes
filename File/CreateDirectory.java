
import java.io.File;
import java.util.Dictionary;

public class CreateDirectory {

    public static void main(String[] args) {
        File dir = new File("Sridhar");
        if (dir.mkdir()) {
            System.out.println("Directory Created");
        } else {
            System.out.println("Error");
        }
    }
}
