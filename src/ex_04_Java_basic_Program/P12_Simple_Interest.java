package ex_04_Java_basic_Program;

public class P12_Simple_Interest {
    static void main() {
        int principle = 700000;
        int time = 5;
        byte rate = 13;
        int Simple_interest = (principle*time*rate)/100;
        System.out.println("Simple interest of the given input :" + Simple_interest);
    }
}
