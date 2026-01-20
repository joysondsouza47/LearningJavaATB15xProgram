package ex_11_OOPS_Concepts.ex_03_methods;

public class P08_call_By_Reference {
    int number;

    void m2(P08_call_By_Reference obj)
    {
        obj.number = obj.number + 10;
        System.out.println("value in the method :" + obj.number);
    }

    public static void main(String[] args)
    {
        P08_call_By_Reference cr = new P08_call_By_Reference();
        cr.number =100;
        System.out.println("value before the method : " + cr.number);

        cr.m2(cr);
        System.out.println("vale after the method : " + cr.number);

        P08_call_By_Reference crr = new P08_call_By_Reference();
        System.out.println(crr.number);   // should give Zero
    }

}
