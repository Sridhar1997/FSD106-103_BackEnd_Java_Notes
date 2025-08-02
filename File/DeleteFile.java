
import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("CSZ1.txt");
        if (f.delete()) {
            System.out.println("Deleted " + f.getName());
        } else {
            System.out.println("File  Not Found");
        }
    }

}
