package ex_11_OOPS_Concepts.ex_03_methods;

public class P07_call_By_Value {

    int number;      // instance variable
    void m1(int number)
    {
        number = number+10;
        System.out.println("value in the method : " +number);
    }//local variable

    public static void main(String[] args)
    {
        P07_call_By_Value cv = new P07_call_By_Value();
        int number=100; // local variable
        System.out.println("Before method :"+ number);

        cv.m1(number);
        System.out.println("After method :"+ number);
    }
}
