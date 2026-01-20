package ex_11_OOPS_Concepts.ex_05_polymorphism;

public class P02_constructor_Overloading {
    int a;
    int b;

    P02_constructor_Overloading()
    {
        a=10;
        b=20;
        System.out.println(a+b);
    }

    P02_constructor_Overloading(int a, int b)
    {
        System.out.println(a+b);
    }

    P02_constructor_Overloading(double a, int b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args)
    {
        P02_constructor_Overloading c1 = new P02_constructor_Overloading();
        P02_constructor_Overloading c2 = new P02_constructor_Overloading(2,7);
        P02_constructor_Overloading c3 = new P02_constructor_Overloading(2.0,8);


    }
}
// Constructor overloading means having more than one constructor in a class with the same name but different parameters.
// Since constructor name is always the class name, we change the parameter list to overload it.
// Key Rules of Constructor Overloading
//
//✔ Same constructor name (class name)
//✔ Different parameter list (number / type / order)
//❌ Return type is not allowed
//❌ Access modifier can be different