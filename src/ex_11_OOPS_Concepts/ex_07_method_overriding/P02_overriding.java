package ex_11_OOPS_Concepts.ex_07_method_overriding;

public class P02_overriding {
    public static void main(String[] args)
    {
        XYZ obj1 = new XYZ();
        obj1.m1(2);
        obj1.m2(3);
        obj1.m2(2,8);

        ABC obj2 = new ABC();
        obj2.m1(2);
        obj2.m2(3);
    }

}

class ABC
{
    void m1(int a)
    {
        System.out.println(a);
    }
    void m2(int b)
    {
        System.out.println(b);
    }
}

class XYZ extends ABC
{
    void m1(int a)
    {
        System.out.println(a*a);
    }
    void m2(int b)
    {
        System.out.println(b*b);
    }
    void m2(int x, int y)
    {
        System.out.println(x+y);
    }
}