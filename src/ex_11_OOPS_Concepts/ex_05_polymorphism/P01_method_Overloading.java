package ex_11_OOPS_Concepts.ex_05_polymorphism;

public class P01_method_Overloading {
// polymorphism - one thing having multiple forms
    // method overloading
    // polymorphism allows one method name to behave differently based on object type or parameters
    // Compile-Time Polymorphism (Method Overloading) Also called static polymorphism
    // When multiple methods have the same name but different parameters in the same class.
    //Explanation
    //
    //Method name is same → add
    //
    //Parameters are different
    //
    //Decision happens at compile time
    //
    //✅ Return type alone cannot change

    int a = 10;
    int b = 10;

    void sum()
    {
        System.out.println(a+b);
    }

    void sum(int a, int b)
    {
        System.out.println(a+b);
    }

    void sum(double a, int b)
    {
        System.out.println(a+b);
    }

    void sum(int b, double a)
    {
        System.out.println(a+b);
    }

    void sum(double a, double b)
    {
        System.out.println(a+b);
    }

    public static void main(String [] args)
    {
        P01_method_Overloading m1 = new P01_method_Overloading();
        m1.sum();   // 30
        m1.sum(1,6); //7
        m1.sum(10.5,9); // 19.5
        m1.sum(6,10.6); // 16.6
        m1.sum(10.5,19.5); //30.0
        m1.sum(); // 7
        System.out.println(m1.a);
    }
}
