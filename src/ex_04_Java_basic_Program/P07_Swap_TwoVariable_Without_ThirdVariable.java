package ex_04_Java_basic_Program;

public class P07_Swap_TwoVariable_Without_ThirdVariable {
    static void main() {
        int i = 76;
        int j = 21;

        i = (i+j); //97
        j = (i-j); //97-21 = 76
        i = (i-j); //97-76 = 21
        System.out.println(i);
        System.out.println(j);
    }
}
