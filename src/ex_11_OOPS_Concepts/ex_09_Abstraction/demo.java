package ex_11_OOPS_Concepts.ex_09_Abstraction;

public class demo implements shape {

    public void circle(){
        System.out.println(length*width);
    }

    void triangle(){
        System.out.println("class method");
    }
}
