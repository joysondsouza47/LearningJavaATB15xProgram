package ex_07_Array_Programs;

import java.util.Arrays;

public class P04_Sort_Elements {
    static void main(String[] args) {
        // sorting numbers
        int a[] = {9,4,6,7,3,2,1,0,5,8};
        System.out.println("Before Sorting : " + Arrays.toString(a));  // print complete Array data
        Arrays.sort(a);
        System.out.println("After Sorting : " + Arrays.toString(a));

        // sorting strings
        String names[] = {"Tilson","Royson","Joyson"};
        System.out.println("Before Sorting : " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("After Sorting : " + Arrays.toString(names));
    }
}
