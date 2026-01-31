package ex_11_OOPS_Concepts.ex_09_Abstraction;

public interface shape {
    int length = 10;
    int width = 20;

    void circle();
    default void square(){
        System.out.println("default method");
    }
    static void rectangle()
    {
        System.out.println("static method");
    }
}
