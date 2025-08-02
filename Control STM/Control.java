
class Control {

    public static void main(String args[]) {
        // int mark = 20;

        // if (mark >= 35) {
        //     System.out.println("Pass");
        // }
        // if (mark < 35) {
        //     System.out.println("Fail");
        // }
        // int mark=10;
        // if(mark>=35){
        //     System.out.println("Pass");
        // }
        // else{
        //     System.out.println("Fail");
        // }
        // int a=50;
        // int b=10;
        // if(a>b){
        //     System.out.println("A is Biggest Value");
        // }
        // else{
        //     System.out.println("B is Biggest Value");
        // }
        // int age=12;
        // if(age>=18){
        //     System.out.println("VE");
        // }
        // else{
        //     System.out.println("NVE");
        // }
        // int year=2028;
        // if(year%4==0){
        //     System.out.println(year+" - Leap Year");
        // }
        // else{
        //     System.out.println(year+" - Not Leap Year");
        // }
        // int num=20;
        // if(num%2==0){
        //     System.out.println("Even Number");
        // }
        // else{
        //     System.out.println("Odd Number");
        // }
        // if(num%2!=0){
        //     System.out.println("Odd Number");
        // }
        // else{
        //     System.out.println("Even Number");
        // }
        // int a = 10;
        // int b = 10;
        // int c = 10;
        // if (a > b && a > c) {
        //     System.out.println("A is Biggest Value");
        // } else if (b > a && b > c) {
        //     System.out.println("B is Biggest value");
        // } else if (c > a && c > b) {
        //     System.out.println("C is Biggest Value");
        // }
        // else{
        //     System.out.println("A = B = C Same Value");
        // }
        // int num = 8;
        // if (num == 0) {
        //     System.out.println("Zero");
        // } else if (num > 0) {
        //     System.out.println("+VE");
        // } else if (num < 0) {
        //     System.out.println("-VE");
        // }
        // int a=500;
        // int b=100;
        // int c=15;
        // if(a>b){
        //     if(a>c){
        //         System.out.println("A is Biggest Value");
        //     }
        //     else{
        //         System.out.println("C is Biggest Value");
        //     }
        // }
        // else{
        //     if(b>c){
        //         System.out.println("B is Biggest Value");
        //     }
        //     else{
        //         System.out.println("C is Biggest Value");
        //     }
        // }
        int num1 = 10;
        int num2 = 2;

        String answer = "+";
        switch (answer) {
            case "+": {
                int result = num1 + num2;
                System.out.println(result);
                break;
            }
            case "-": {
                int result = num1 - num2;
                System.out.println(result);
                break;
            }
            case "*": {
                int result = num1 * num2;
                System.out.println(result);
                break;
            }
            default: {
                System.out.println("Please Check Value");
                break;
            }
        }
    }
}
