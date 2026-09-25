package jobsheet4;

public class Main {

public static void main(String[] args) {
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        Account acc1 = new Account("A001", customer1, 500000);
        Account acc2 = new Account("A002", customer1, 1000000);

        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        Account acc3 = new Account("A003", customer2, 200000);
        
        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        System.out.println("--- Pencarian Akun bernama Nadia");
        Account[] nadiaAccounts = bank.findAccountsByOwnerName("Nadia");

        System.out.println("Jumlah Rekening ditemukan " + nadiaAccounts.length);
        for (Account acc : nadiaAccounts) {
            acc.printInfo();
        }

    }
}
