// Method Overloading - multiple methods can have the same name with different parameters 

public class Main2 {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        int answer1 = add(10, 10);
        double answer2 = add(10.55, 10.55);
        String answer3 = add("Java ", "OOPS");

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }

}
