
public class LoopExample {

    public static void main(String args[]) {
        // int i = 1;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i <= 3);

        // int i = 1;
        // while (i <= 3) {
        //     // System.out.println(i);
        //     System.out.println("Welcome to Credo Systemz");
        //     i++;
        // }
        // for (int i = 1; i <= 3; i++) {
        //     // System.out.println(i);
        //     System.out.println("Sridhar");
        // }
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i+" * 5  = "+i*5);
        // }
        // for(int i=1;i<=10;i++){
        //     if(i%2==0)
        //     {
        //         System.out.println("Even Number - "+i);
        //     }
        //     else{
        //         System.out.println("Odd  Number - "+i);
        //     }
        // }
        for (int i = 1; i <= 10; i++) {
            // System.out.println(i);
            if (i == 5) {
                // break;
                continue;
            }
            System.out.println(i);
        }
    }
}
