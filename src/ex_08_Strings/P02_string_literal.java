package ex_08_Strings;

public class P02_string_literal {
    public static void main(String [] args)
    {
        // using string literal
        String s = "joyson";
        String a = "joyson";
        System.out.println(s);
        System.out.println(a);
    }
}
// 's' and 'a' are having reference data of "joyson"
// both 's' and 'a' are pointed to same object.
// this is stored in string constant pool inside heap
// memory efficient