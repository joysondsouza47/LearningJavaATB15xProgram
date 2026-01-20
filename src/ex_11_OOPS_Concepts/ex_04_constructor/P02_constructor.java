package ex_11_OOPS_Concepts.ex_04_constructor;
public class P02_constructor {
    int a;
    int b;

    P02_constructor()   // constructor
    {
        a=10;
        b=20;
    }
    void sum()
    {
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        P02_constructor cs = new P02_constructor();
        cs.sum();
    }
}
//A constructor in Java is a special method that is used to create and initialize an object.
//Name is same as the class name
//No return type (not even void)
//Used to initialize variables
//Called automatically when an object is created