package ex_07_Array_Programs;

public class P05_Reverse_Array {
    static void main() {
        int a[] = {10,20,30,40,50,60};

//        for (int i=a.length-1; i >=0 ; i--){
//            System.out.println(a[i]);
//        }
        int i = a.length-1;
        while(i>=0){
            System.out.println(a[i]);
            i--;
        }
    }
}
