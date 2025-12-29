package ex_03_Core_Java;

public class Lab008_Increment_decrement {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[1]);
        a = a++ + a++ + a++;
        System.out.println(a);
    }
}
