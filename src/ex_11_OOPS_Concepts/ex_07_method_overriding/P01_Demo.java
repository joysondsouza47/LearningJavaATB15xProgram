package ex_11_OOPS_Concepts.ex_07_method_overriding;

class Bank
{
    double roi()
    {
        return 0;
    }
}
class ICICI extends Bank
{
    double roi()
    {
        return 10.5;
    }

}
class SBI extends Bank
{
    double roi()
    {
        return 11.5;
    }
}

public class P01_Demo {
    public static void main(String[] args)
    {
        Bank obj1 = new Bank();
        System.out.println(obj1.roi());

        ICICI obj2 = new ICICI();
        System.out.println(obj2.roi());

        SBI obj3 = new SBI ();
        System.out.println(obj3.roi());
        
    }
}
