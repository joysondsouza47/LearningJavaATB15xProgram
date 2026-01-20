package ex_09_String_programs;
import java.util.Arrays;

public class P01_Reverse_String {
    static void main() {

        // method 1
        String s = "joyson";
        String reverse = "";
        for( int i = s.length()-1; i>=0 ; i--)
        {
            reverse += s.charAt(i);
        }
        System.out.println(reverse);

        // method 2
        // toCharArray() // this will convert string character type to array
        String name = "joyson";
        char x[] = name.toCharArray();
        String rev1 = "";
        System.out.println(Arrays.toString(x));

        for (int i = x.length - 1; i >= 0; i--) {
            rev1 = rev1 + x[i];
        }
        System.out.println(rev1);

        // in java there is no reverse method

        StringBuffer s1= new StringBuffer("welcome");
        System.out.println(s1.reverse());

        StringBuilder s2 = new StringBuilder("welcome");
        System.out.println(s2.reverse());

    }
}
