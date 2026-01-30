package ex_11_OOPS_Concepts.ex_08_Encapsulation;

public class P01_private_keyword {
    private int accnum;
    private String name;
    private double amount;

    public int getAcconum() {
        System.out.println("your account number is:");
        return accnum;
    }

    public void setAcconum(int accnum) {
        this.accnum = accnum;
    }


    public static void main(String[] args) {
        P01_private_keyword pr = new P01_private_keyword();
        pr.setAcconum(10506);
        System.out.println(pr.getAcconum());

    }
}