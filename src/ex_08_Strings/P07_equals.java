package ex_08_Strings;

public class P07_equals {
    public static void main(String[] arg)
    {
        String a = "joyson";
        String b = "joyson";
        String s = "Joyson";
        String c = new String("joyson");
        String d = new String("joyson");
        System.out.println(a.equals(b)); //true  compares the content of object
        System.out.println(a.equals(c)); //true  compares the content of object
        System.out.println(a.equals(s)); //false case sensitive
        System.out.println(c.equals(d)); //true  compares the content of object
        System.out.println(a==b); //true   compares the reference of object
        System.out.println(c==d); //false  compares the reference of object
        System.out.println(a==c); //false  compares the reference of object
        System.out.println(a==s); //false case sensitive

    }
}
