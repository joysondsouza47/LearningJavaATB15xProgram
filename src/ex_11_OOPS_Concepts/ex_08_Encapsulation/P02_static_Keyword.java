package ex_11_OOPS_Concepts.ex_08_Encapsulation;

public class P02_static_Keyword {
    static int age;
    static String name;
    static String job;
    private int num;


    static void m1(){// static method
        System.out.println("my name is joyson");
    }

    void m2(){ // non-static method
        System.out.println("welcome to java");
    }

    void m3(){ //non-static method can access everything directly.
        System.out.println("non static method");
        m1();
        m2();
    }


    public static void main(String[] args){
        P02_static_Keyword obj1 = new P02_static_Keyword();
        P02_static_Keyword.job = "mechanic";
        P02_static_Keyword.name = "joyson";
        P02_static_Keyword.m1();
        obj1.num = 12345456;
        obj1.m2();
        obj1.m3();

    }
}
