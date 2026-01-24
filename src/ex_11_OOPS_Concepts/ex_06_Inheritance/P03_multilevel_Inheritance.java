package ex_11_OOPS_Concepts.ex_06_Inheritance;

public class P03_multilevel_Inheritance {
    public static void main(String[] args){
        grand_father f1 = new grand_father();
        System.out.println(f1.oldcar);
        f1.gfc();

        son1 s1 = new son1();
        System.out.println(s1.oldcar); // grandfather
        System.out.println(s1.car);  // father
        System.out.println(s1.newcar); // son
        s1.gfc(); // grandfather
        s1.fc();  // father
        s1.sc();  // son

        Father f2 = new Father();
        System.out.println(f2.car);    // father
        System.out.println(f2.oldcar); // grandfather
        f2.gfc(); // grandfather
        f2.fc();  // father


        grand_father gg = new son1();  // dynamic dispatch

    }
}

class grand_father{
    String oldcar = "ford";
    void gfc(){
        System.out.println("grandfather car");
    }
}
class Father extends grand_father{
    String car = "mustang";
    void fc(){
        System.out.println("father car");
    }
}
class son1 extends Father{
    String newcar = "ferrari";
    void sc(){
        System.out.println("son car");
    }
}