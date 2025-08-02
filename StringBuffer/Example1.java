
public class Example1 {

    public static void main(String args[]) {
        // StringBuffer sb = new StringBuffer("Hello Java");
        // System.out.println(sb);

        // sb.append(" Full Stack");
        // System.out.println(sb);
        // sb.insert(0, "Full Satck - React JS + Spring Boot ");
        // System.out.println(sb);
        // sb.replace(6, 10, "World");
        // System.out.println(sb);
        // sb.delete(6, 10);
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);
        // System.out.println(sb.length());
        // System.out.println(sb.charAt(1));
        // sb.setCharAt(1, 'a');
        // System.out.println(sb);
        // String s=sb.toString();
        // System.out.println(s);
        // Chaining Methods 
        StringBuffer sb = new StringBuffer("Hi");
        sb.append(" There").insert(2, " , ");
        System.out.println(sb);

    }
}
