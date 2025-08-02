import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File answer=new File("CSZ.txt");

        if(answer.exists()){
            System.out.println(answer.getName());
            System.out.println(answer.getAbsolutePath());
            System.out.println(answer.canWrite());
            System.out.println(answer.canRead());
            System.out.println(answer.length());
        }
        else{
            System.out.println("File does not exist");
        }
    }
    
}
