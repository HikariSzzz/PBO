package Jobsheet7;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rian","0812-0000-0003");
        BusinessAccount business = new BusinessAccount("B001", customer, 2000000, 50000);
    
        boolean result = business.withdraw(1500000);
        System.out.println("withdraw 1500000 berhasil? " + result);

        business.printInfo();
    }
}
