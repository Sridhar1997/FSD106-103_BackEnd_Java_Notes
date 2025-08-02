
public class Main1 {

    static void checkAge(int Age) {
        if (Age >= 18) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }

    public static void main(String[] args) {
        checkAge(5);
    }
}
