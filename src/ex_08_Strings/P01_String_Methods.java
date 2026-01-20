package ex_08_Strings;

import java.util.Arrays;

public class P01_String_Methods {
    static void main() {
        String s = "Welcome";
        // String s = new String("Welcome");
        System.out.println(s); // Welcome

        // length() - returns length of the string
        System.out.println("length of the string is : "  + s.length());  //7

        //concat() - adds element of different Strings
        String s1 = "Welcome ";
        String s2 = "to Java Programming ";
        String s3 = "Joyson Dsouza";
        System.out.println(s1.concat(s2)); // concat 2 strings //Welcome to Java Programming
        System.out.println(s1.concat(s2+s3)); // approach 1 : concat 3 strings // Welcome to Java Programming Joyson Dsouza
        System.out.println(s1.concat(s2).concat(s3)); // approach 2 : concat 3 strings // Welcome to Java Programming Joyson Dsouza
        System.out.println("Welcome ".concat("to Java Programming Joyson Dsouza")); // approach 3 : concat 2 strings // Welcome to Java Programming Joyson Dsouza
        System.out.println("Welcome "+"to Java Programming Joyson Dsouza"); // approach 4 : add 2 strings // Welcome to Java Programming Joyson Dsouza

        //trim() - removes spaces right and left side
        String trim1 = "  Joyson Dsouza  ";
        System.out.println(trim1);  //  Joyson Dsouza
        System.out.println("length before trim : " + trim1.length()); //17
        trim1 = trim1.trim();
        System.out.println(trim1);  //Joyson Dsouza
        System.out.println("length After trim : " + trim1.length()); // 13

        //chatAt() - Returns a char from a string based on index. index start from 0 -- last index value n-1
        String s4 = "Welcome joyson";
        System.out.println(s4.charAt(0)); // W

        //contains - return true/false
        System.out.println(s4.contains("wel"));  // Case-sensitive  //false
        System.out.println(s4.contains("Wel"));  // Case-sensitive  //true
        System.out.println(s4.contains("wecom")); // sequence is important  //false

        //equals(), equalsIgnoreCase() - compare 2 Strings
        // always use equals() to compare strings don't use ==
        String s5 = "welcome";
        String s6 = "welcome";
        System.out.println(s5.equals(s6)); //true
        System.out.println(s5.equals("Welcome")); // case-sensitive  //false
        System.out.println(s5.equalsIgnoreCase("Welcome")); //ignores case sensitivity //true

        //replace() - replace single character/sequence of characters in a string
        String s7="welcome to selenium java python python c#";
        System.out.println(s7.replace('e','o')); //replace all e with o
        System.out.println(s7.replace("python","c++"));

        //substring() - extract substring from the main string
        System.out.println(s7.substring(0,6)); // welcome  --- 0-starting index  6 -ending index

        //toUpperCase()  toLowerCase() - convert case
        System.out.println(s7.toUpperCase());
        System.out.println(s7.toLowerCase());

        //split() - split/divide the string in to multiple parts based on 'delimeter'
        String s8 = "12334&welcome";
        String a[] = s8.split("&");  //Here delimeter is &
        System.out.println(a[0]);
        System.out.println(a[1]);
        String s9 = "1234_welcome_joyson";
        String b[] = s9.split("_");
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        //example - "&15,20,55"   output-- 152055
        String amount = "&15,20,55";
        amount = amount.replace("&","").replace(",","");
        System.out.println(amount);

        // Example 2 - "abc,123@xyz"  output abc, 123, xyz
        String value = "abc,123@xyz";
        value = value.replace("@",",");
        String c[] = value.split(",");
        System.out.println(Arrays.toString(c));

        // Example 3 "abc 123 xyz"
        String value2 = "abc 123 xyz";
        String d[] = value2.split(" ");
        System.out.println(Arrays.toString(d));

        //combination of methods
        String name1 = "John kenedy";
        System.out.println(name1.contains("john")); //false
        System.out.println(name1.toLowerCase().contains("john")); //true
        System.out.println(name1.replace("J","j").contains("john")); //true

        // toCharArray() // this will convert string character type to array
        String name = "joyson";
        char x[] = name.toCharArray();
        String rev = "";
        System.out.println(Arrays.toString(x));

        for (int i=x.length-1; i>=0; i--){
            rev = rev + x[i];
        }
        System.out.println(rev);
    }
}
