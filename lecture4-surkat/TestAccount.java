import java.util.Scanner;

public class TestAccount {
    private long accountNr;
    private String name;
    private double balance;

    public TestAccount(long accountNr, String name, double balance) {
        this.accountNr = accountNr;
        this.name = name;
        this.balance = balance;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long getAccountNr = in.nextLong();
        String getName = in.nextLine();
        //TestAccount x = new TestAccount(getAccountNr, getName, input3);


    }
}
