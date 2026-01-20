package ex_08_Strings;

public class P17_empty {
    public static void main(String[] args)
    {
        String s = " ";
        String a = "";
        String b = null;
        System.out.println(s.isEmpty()); // false
        System.out.println(a.isEmpty()); // true
        // System.out.println(b.isEmpty()); // NullPointerException
    }
}
