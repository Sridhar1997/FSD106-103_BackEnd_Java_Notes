
public class Main {

    // static void display() {
    //     System.out.println("Welcome to Credo Systemz");
    // }
    // without arg, without return type
    // static void add() {
    //     int a = 5;
    //     int b = 10;
    //     int c = a + b;
    //     System.out.println(c);
    // }
    // with arg, without return type
    // static void add(int a, int b, int c, int d, int e) {
    //     int answer = a + b + c + d + e;
    //     System.out.println(answer);
    // }
    // without arg, with return type
    // static int add() {
    //     int a = 10;
    //     int b = 10;
    //     int c = a + b;
    //     return c;
    // }
    // with arg, with return type
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        // display();
        // add();
        // add(90, 100, 100, 100, 100);
        // System.out.println(add());
        System.out.println(add(1, 2, 3));
    }
}
