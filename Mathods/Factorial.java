
public class Factorial {

    static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n - 1);
            // 5*f(5-1=4)
            // 5*4*3*2*1
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int value = factorial(5);
        System.out.println(value);
    }

}
