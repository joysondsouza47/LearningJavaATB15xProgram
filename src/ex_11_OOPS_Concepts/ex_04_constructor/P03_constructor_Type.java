package ex_11_OOPS_Concepts.ex_04_constructor;

public class P03_constructor_Type {

    int a;
    int b;

    P03_constructor_Type(int x,int y)
    {
        a=x;
        b=y;
    }

    void sum()
    {
        System.out.println(a+b);
    }
}
