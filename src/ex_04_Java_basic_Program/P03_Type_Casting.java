package ex_04_Java_basic_Program;

public class P03_Type_Casting {
    static void main() {
        int i = 10;
        double d = (int)i;   // int to double
        System.out.println(d);
        double c = 20.343;   // double to int
        int j = (int) c;
        System.out.println(j);

        int k = 129;
        byte b = (byte) k;
        System.out.println(k);
        System.out.println(b); // Overflow occurs

    }
}
// Output
// 10.0
// 20
// 129
//-127