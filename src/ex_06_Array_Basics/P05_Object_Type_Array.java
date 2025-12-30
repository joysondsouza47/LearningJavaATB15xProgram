package ex_06_Array_Basics;

import java.util.Arrays;

public class P05_Object_Type_Array {
    static void main() {
        Object a[] = {123,"joyson",'D', 2914.29};
        System.out.println(Arrays.toString(a));


        for (Object x:a){
            System.out.println(x);
        }
    }
}
