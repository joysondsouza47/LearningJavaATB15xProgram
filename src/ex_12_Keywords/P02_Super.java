package ex_12_Keywords;

public class P02_Super {
    public static void main(String[] args)
    {
        dog a1 = new dog();
        a1.display();
        a1.eat();
    }
}



class animal{
    String color = "white";
    void display(){
        System.out.println(color);
    }
    void eat(){
        System.out.println("this is not a animal");
    }
}

class dog extends animal{
    String color = "black";
    void display(){
        System.out.println(super.color);
    }
    void eat(){
        super.eat();
        System.out.println("this is a animal");

    }
}
