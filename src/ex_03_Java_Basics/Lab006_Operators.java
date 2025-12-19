package ex_03_Java_Basics;

public class Lab006_Operators {
    public static void main (String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 10;
        int e = 20;
        int f = 30;
        int g = 100;
        int h = 100;
        int i = 50;
        int j = 90;
        boolean status = true;
        // arithmetic operators [(add +), (subtract -), (Multiply  *), (Divide /), (Modulo %)]
        System.out.println("arithmetic operators");
        System.out.println("a is added to b:" + (a+b)); // 30
        System.out.println(a-b); // -10
        System.out.println(a*b); // 200
        System.out.println(b/a); // 2
        System.out.println(b%a); // 0
        // relational/comparision operator [ < <= > >= == !=]
        System.out.println("relational/comparision operator");
        System.out.println(a>b);  // false
        System.out.println(a>=b); // false
        System.out.println(a<b);  // true
        System.out.println(a<=b); // true
        System.out.println(a==b); // false
        System.out.println(a!=b); // true
        // logical opearator  [&& || !]
        System.out.println("logical opearator");
        System.out.println(a<b&&e<f); // true
        System.out.println(a>b&&e<f); // false
        System.out.println(a<b||e<f); // true
        System.out.println(a>b||e<f); // true
        System.out.println(!status); // false
        // Increment/decrement operator [++ --]
        System.out.println("Increment/decrement operator");
        System.out.println(a++); // first it will print a value and then it will increment + 1 - 10
        System.out.println(a);   // print a value - 11
        System.out.println(b--); // first it will print b value and then it will decrement - 1 - 20
        System.out.println(b);   // print b value - 19
        System.out.println(++c); // first it will  increment + 1 and then print c value - 31
        System.out.println(--d); // first it will  decrement - 1 and then print c value - 9
        // assignment operator [= += -= *= /= %=]
        System.out.println("assignment operator");
        e = 50; // will assign this value to e
        f += 6; // will add this value to the existing value
        f =+ 1; // will replace the old value with this value
        g -= 10;// will subtract this value to the existing value
        g =- 40;// will replace the old value with this value
        h /= 10;// It divides the current value of h by 10 and stores the result back into h
        i *= 5; // It multiplies the current value of i by 5 and stores the result back into i
        j %= 3; // It checks the remainder of the current value of j by 3 and stores the result back into i
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        // Conditional/ternary operator [?:]
        System.out.println("Conditional/ternary operator");
        int marks = 78;
        String grade =   (marks >= 90) ? "A" :
                         (marks >= 75) ? "B" :
                         (marks >= 50) ? "C" : "Fail";
        System.out.println(grade);
        boolean loggedin = false;
        String loginstatus = (!loggedin)? "welcome" : "bye";
        System.out.println(loginstatus);
    }
}
