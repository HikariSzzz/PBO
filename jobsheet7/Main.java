package jobsheet7;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rian","0812-0000-0003");
        SavingsAccount savings = new SavingsAccount("A003", customer, 100000, 0.02);

        Customer customer2 = new Customer("Dewi", "0812-000-0004");
        CheckingAccount checking = new CheckingAccount("A003" , customer2, 10000, 200000);
        boolean result = savings.withdraw(250000);
        System.out.println("Withdraw 250000 allowed?" + result);

        
    }
}
