package ex_11_OOPS_Concepts.ex_03_methods;

public class P01_main_class {
    public static void main(String [] args)
    {
        P02_method m = new P02_method();
        m.sum();

        P03_method_type1 m1 = new P03_method_type1();
        m1.sum();

        P04_method_type2 m2 = new P04_method_type2();
        m2.a = 1;
        m2.b = 4;
        m2.c = 5;
        System.out.println(m2.sum());

        P05_method_type3 m3 = new P05_method_type3();
        m3.sum(12,11,12);

        P06_method_type4 m4 = new P06_method_type4();
        System.out.println(m4.sum(12,45,90));

    }
}
