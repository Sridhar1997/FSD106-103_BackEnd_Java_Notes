
// public class Main {
//     int age;
//     public Main() {
//         age = 27;
//     }
//     public static void main(String args[]) {
//         Main obj = new Main();
//         System.out.println(obj.age);
//     }
// }
public class Main {

    int age;

    public Main(int a) {
        age = a;
    }

    public static void main(String[] args) {
        Main obj = new Main(20);
        System.out.println(obj.age);
    }
}
