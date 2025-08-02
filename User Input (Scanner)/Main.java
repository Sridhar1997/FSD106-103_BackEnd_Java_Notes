// Scanner - User Input - Package - import java.util

// Input Types 
// Bollean - nextBoolean()
// Byte - nextByte()
// Double - nextDouble()
// Float - nextFloat()
// Int - nextInt()
// String - nextLine()
// Long - nextLong()
// Short - nextShort()
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);

        System.out.println("Enter the A Value - ");
        int a = answer.nextInt();
        System.out.println("Enter the B Value - ");
        int b = answer.nextInt();

        if (a > b) {
            System.out.println("A is Biggest Value");
        } else {
            System.out.println("B is Biggest Value");
        }

        // System.out.println("Enter the Number - ");
        // int number = answer.nextInt();
        // if (number % 2 == 0) {
        //     System.out.println("Even Number - " + number);
        // } else {
        //     System.out.println("Odd Number - " + number);
        // }
        // System.out.println("Enter the User Name - ");
        // String name = answer.nextLine();
        // System.out.println("Enter the Age - ");
        // int age = answer.nextInt();
        // System.out.println("Enter the Salary - ");
        // double salary=answer.nextDouble();
        // System.out.println("Name - " + name);
        // System.out.println("Age - " + age);
        // System.out.println("Salary - "+salary);
    }
}
