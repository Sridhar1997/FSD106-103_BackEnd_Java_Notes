
public class Main1 {

    public static void main(String[] args) {
        int marks[] = {40, 50, 60, 70, 80, 90, 100, 20, 30, 10, 5, 45, 65, 75};
        float avg, sum = 0;

        int length = marks.length;
        System.out.println("Length - " + length);

        for (int value : marks) {
            sum += value;
            // sum=sum+value
            System.out.println("Sum - " + sum);
        }

        avg=sum/length;
        System.out.println("Average - "+avg);

    }

}
