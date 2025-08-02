// Arrays - Arrays are used to store multiple values in a single variable 

public class Main {

    public static void main(String args[]) {
        String[] topics = {"Core Java", "OOPS Java", "Collections", "GUI", "Database - MySQL"};

        // For Loop 
        // for(int i=0;i<topics.length;i++){
        //     System.out.println(i+ " - "+topics[i]);
        // }
        // For-Each
        // for(type variable : arrayname)
        // {
        //     // .. .. block of code 
        // }
        for (String i : topics) {
            System.out.println(i);
        }

        // Index / Position - 0
        // Length - 1
        // System.out.println(topics[0]);
        // System.out.println(topics[1]);
        // System.out.println(topics[2]);
        // System.out.println(topics[3]);
        // System.out.println(topics[4]);
        // Change an Array Element
        // System.out.println(topics[0]);
        // topics[0]="Java Learning Path";
        // System.out.println(topics[0]);
        // Array Length 
        // System.out.println(topics.length);
    }
}
