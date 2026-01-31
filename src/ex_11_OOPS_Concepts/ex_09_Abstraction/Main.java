package ex_11_OOPS_Concepts.ex_09_Abstraction;

public class Main {
    public static void main(String[] args)
    {
        demo obj1 = new demo();  // class object with class reference
        obj1.circle();       //abstract method
        obj1.square();       //default method
        shape.rectangle();   //static method
        obj1.triangle();     //normal method

        shape obj2 = new demo();  // interface reference with class object
        obj2.circle();            // abstract method
        obj2.square();            // default method
        shape.rectangle();        // static method
    }

}
