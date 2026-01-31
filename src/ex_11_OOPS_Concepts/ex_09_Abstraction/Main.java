package ex_11_OOPS_Concepts.ex_09_Abstraction;

public class Main {
    public static void main(String[] args)
    {
        demo obj1 = new demo();
        obj1.circle();       //abstract method
        obj1.square();       //default method
        shape.rectangle();   //static method
        obj1.triangle();     //normal method
    }
}
