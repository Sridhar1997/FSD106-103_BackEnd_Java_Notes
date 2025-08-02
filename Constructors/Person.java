// Parameterized Constructor 

public class Person {

    String name;

    Person(String n) {
        name = n;
    }

    void show() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person p = new Person("Sridhar");
        p.show();
    }

}
