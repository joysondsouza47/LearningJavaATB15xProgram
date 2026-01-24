package ex_11_OOPS_Concepts.ex_06_Inheritance;

public class P01_single_inheritance {
    public static void main(String[] args){
        son joyson = new son();
        System.out.println(joyson.gold);
        joyson.bhk3();
        joyson.bhk2();

        father Gabriel = new father();
        Gabriel.bhk2();
        System.out.println(Gabriel.gold);
        //Gabriel.bhk3;  cannot use
    }
}

class father{
    int gold = 1000;
    void bhk2(){
        System.out.println("Father 2BHK");
    }
}
class son extends father
{
    void bhk3()
    {
        System.out.println("Son 3BHK");
    }
}
