
// public class Main {
//     int age = 27;
//     public static void main(String[] args) {
//         Main obj = new Main();
//         System.out.println(obj.age);
//     }
// }
// -------------------------------------------------------------------
// public class Main {
//     int age = 27;
//     String name = "Sridhar";
// }
// -----------------------------------------------------------
// Modify Attributes 
// public class Main {
//     String name = "Sridhar";
//     // final int age = 27;
//     int age = 26;
//     int salary = 500000;
//     public static void main(String[] args) {
//         Main obj = new Main();
//         System.out.println(obj.age);
//         obj.age = 28;
//         System.out.println(obj.age);
//     }
// }
// ------------------------------------
class Main {

    String FName = "Sridhar";
    String LName = "Raj P";
    String role = "Software Developer";

    int age = 27;

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.FName + " " + obj.LName);
        System.out.println(obj.role);
        System.out.println(obj.age);
    }
}
