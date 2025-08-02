
public class Main4 {

    public static int add(int n) {
        if (n > 0) {
            return n + add(n - 1);
            // 10>0 - true 
            // 10+add(10-1=9) 10+9
            // 10+9+add(9-1=8) 10+9+8
            // 10+9+8+add(8-1=7) 10+9+8+7
            // 10+9+8+7+add(7-1=6) 10+9+8+7+6
            // 10+9+8+7+6+add(6-1=5) 10+9+8+7+5
            // ........
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int answer = add(10);
        System.out.println(answer);
    }

}
