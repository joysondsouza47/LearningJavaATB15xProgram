package ex_13_Exception_Handling;

public class MAIN {

    public static void main(String[] args) {
        name d1 = name.FRIDAY;
        switch (d1) {
            case MONDAY, TUESDAY: {
                System.out.println(d1.ordinal());
                break;
            }
            default: {
                System.out.println("exit");
            }
        }
    }
}