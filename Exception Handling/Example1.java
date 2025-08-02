
import java.io.FileReader;
import java.io.IOException;

public class Example1 {

    // static void myMethod() throws ArithmeticException{
    //     int a=10/0;
    //     System.out.println(a);
    // }
    public static void main(String args[]) {

        // try {
        //     myMethod();
        // } catch (Exception e) {
        //     System.out.println("Error Please Check Input (0)");
        // }
        // try {
        //     FileReader fr = new FileReader("file1.txt");
        // } catch (IOException e) {
        //     System.out.println(e);
        //     System.out.println("File not Found");
        // }

        try {
            int a=Integer.parseInt("123");
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number Format");
        }

        // try {
        //     int a = 5 / 0;
        //     System.out.println(a);
        // } catch (ArithmeticException e) {
        //     System.out.println(e);
        // }
        // int[] arr = {1, 2, 3};
        // try {
        //     System.out.println(arr[1]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("Thank You");
        // }
        // try{
        //     String s=null;
        //     System.out.println(s.length());
        // }
        // catch(NullPointerException e){
        //     System.out.println(e);
        //     System.out.println("Caught Null Pointer Exception");
        // }
    }
}
