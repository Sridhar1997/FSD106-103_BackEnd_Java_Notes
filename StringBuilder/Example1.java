
public class Example1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Start");

        System.out.println(sb);

        sb.append(" Here").insert(5, " - ").reverse();
        System.out.println(sb);

        // System.out.println(sb.length());
        // System.out.println(sb.charAt(1));
        // sb.setCharAt(1, 'a');
        // System.out.println(sb);

        // sb.reverse();
        // System.out.println(sb);
        // sb.delete(5,11);
        // System.out.println(sb);
        // sb.deleteCharAt(3);
        // System.out.println(sb);
        // sb.replace(5, 12, "Evening");
        // System.out.println(sb);
        // sb.insert(4, " Programming");
        // System.out.println(sb);
        // sb.append(" World");
        // System.out.println(sb);
    }
}
