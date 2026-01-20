package ex_08_Strings;

import java.sql.SQLOutput;

public class P09_upper_lower_case {
    public static void main(String [] args)
    {
        String s = "joyson";
        String a = "DSOUZA";
        System.out.println(s.toUpperCase()); //JOYSON
        System.out.println(a.toLowerCase()); //dsouza
        System.out.println(s); //Strings are immutable joyson
        System.out.println(a); //Strings are immutable DSOUZA
    }
}
