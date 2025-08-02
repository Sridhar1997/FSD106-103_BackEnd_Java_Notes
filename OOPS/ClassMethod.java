
public class ClassMethod {

    // static void mymethod() {
    //     System.out.println("Welcome to Credo Systemz");
    // }
    // Static vs Public 
    static void myStaticMethod() {
        System.out.println("Static Method Example");
    }

    public void myPublicMethod() {
        System.out.println("Public Method Example");
    }

    public static void main(String[] args) {
        // mymethod();

        myStaticMethod();

        ClassMethod answer=new ClassMethod();
        answer.myPublicMethod();
       
    }

}
