package jobsheet3;

public class Main {
    public static void main(String[] args) {
        Account limited = new Account ("A001", "Fajar", 400000, 500000);
        System.out.println("Withdraw 700000 allowed? " + limited.withdraw(700000));
        System.out.println("Withdraw 350000 allowed? " + limited.withdraw(350000));
    }
}