package ex_04_Java_basic_Program;

public class P26_Incrementation {
    public static void main(String []args){
        int a = 10;
        int b = 20;
        int c = a++; // post increment
        int d = ++b; // pre increment

        System.out.println(a);  // 11
        System.out.println(b);  // 21
        System.out.println(c);  // 10
        System.out.println(d);  // 21


        int x = 20;
        int y = 30;
        int i = x--;
        int j = --y;
        System.out.println(x);  // 19
        System.out.println(y);  // 29
        System.out.println(i);  // 20
        System.out.println(j);  // 29
    }
}
