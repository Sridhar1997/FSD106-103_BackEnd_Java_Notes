
public class Main3 {

    static String display(String name) {
        return "Welcome " + name;
    }

    static int display(int x, int y) {
        return x + y;
    }

    static double display(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        int answer1 = display(10, 10);
        System.out.println(answer1);
        double answer2 = display(11.55, 10.21);
        System.out.println(answer2);
        String answer3 = display("Sri");
        System.out.println(answer3);

    }

}
