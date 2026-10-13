package test;

/**
 * Manual playground — NOT graded.
 */
public class Main {

    public static void main(String[] args) {
        // Bikin menu dan isi beberapa item
        Menu menu = new Menu();
        MenuItem kopi = new MenuItem("Kopi Susu", 18000);
        MenuItem roti = new MenuItem("Roti Bakar", 15000);
        menu.addMenuItem(kopi);
        menu.addMenuItem(roti);

        // Bikin customer
        Customer customer = new Customer("C001", "Nadia");

        // Bikin order, tambahkan item lewat OrderItem
        Order order = new Order(customer);
        order.addOrderItem(new OrderItem(menu.findItem("Kopi Susu"), 2));
        order.addOrderItem(new OrderItem(menu.findItem("Roti Bakar"), 1));

        System.out.println("Customer   : " + order.getCustomer().getName());
        System.out.println("Item count : " + order.getItemCount());
        System.out.println("Total      : " + order.getTotalPrice());

        // Proses pembayaran lewat Cashier
        Cashier cashier = new Cashier("Budi");
        double kembalian = cashier.processPayment(order, 60000);
        if (kembalian < 0) {
            System.out.println("Pembayaran kurang!");
        } else {
            System.out.println("Kembalian  : " + kembalian);
        }
    }
}
