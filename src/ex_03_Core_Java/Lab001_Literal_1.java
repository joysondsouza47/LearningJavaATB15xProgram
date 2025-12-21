package ex_03_Core_Java;

public class Lab001_Literal_1 {
    public static void main(String[] args){
        int binary = 0b1010;
        int hex = 0xFF;
        // int e = null;
        // null cannot be used here
        String name1 = null;
        // here null can be used
        String name2 = "";
        // blank can be used
        long amount = 1_00_000L;
        char name = 'F';
        System.out.println(hex);
    }

}
