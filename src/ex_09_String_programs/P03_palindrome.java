package ex_09_String_programs;

public class P03_palindrome {

    public static void main(String[] args) {
        String s = "madam";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println(s);
        System.out.println(reverse);
        System.out.println("String value is a Palindrome : " + s.equals(reverse));
    }
}
