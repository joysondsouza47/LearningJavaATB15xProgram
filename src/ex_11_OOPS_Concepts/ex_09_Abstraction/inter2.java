package ex_11_OOPS_Concepts.ex_09_Abstraction;

public interface inter2 {
    int b =20;
    void m2();

    default void m5(){
        System.out.println("m5 static method");
    }
}
