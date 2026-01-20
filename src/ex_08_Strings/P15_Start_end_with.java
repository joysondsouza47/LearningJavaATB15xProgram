package ex_08_Strings;

public class P15_Start_end_with {
    public static void main(String[] args)
    {
        String s = "Java is a programming language";
        System.out.println(s.startsWith("Java")); // case_sensitive
        System.out.println(s.endsWith("uage")); // case_sensitive
    }
}
// startsWith means string object content starts with this word "java"
// endsWith means string object content ends with this word "uage"