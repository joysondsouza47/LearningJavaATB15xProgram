package ex_09_String_programs;

import java.util.Arrays;

public class P02_Compare_String {
    static void main() {
        // Case 1
        String s1 = "welcome";
        String s2 = "welcome";
        System.out.println(s1==s2);  //true
        System.out.println(s1.equals(s2)); //true

        // Case 2
        String s3 = new String("welcome");
        String s4 = new String("welcome");
        System.out.println(s3==s4);         // false
        System.out.println(s3.equals(s4));  // true

        // == is used to compare the object
        // equals() is used to compare the values in object

        // Case 3
        String s5 = "welcome";
        String s6 = new String("welcome");
        System.out.println(s5==s6);         // false
        System.out.println(s3.equals(s4));  // true

        // Case 4
        String s7 = "welcome";
        String s8 = new String("welcome");
        String s9 = s8;
        System.out.println(s7==s8);         // false
        System.out.println(s7.equals(s8));  // true
        System.out.println(s8==s9);         // true
        System.out.println(s8.equals(s9));  // true


        //mutable - can change  --- StringBuffer StringBuilder
        //immutable - we cannot change   --- String
        //String StringBuffer StringBuilder

        String s11 = "welcome";  //immutable
        s11.concat(" to java");
        System.out.println(s11);  // this won't impact the original value

        StringBuffer s12 = new StringBuffer("welcome"); //mutable
        s12.append(" to java");
        System.out.println(s12); // this will impact the original value

        StringBuilder s22 = new StringBuilder("welcome"); //mutable
        s22.append(" to java");
        System.out.println(s22); // this will change the original value


        // Mutable vs immutable
        int a[] = {8,7,6,5,4,3,2,1};
        int b[] = a;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}

