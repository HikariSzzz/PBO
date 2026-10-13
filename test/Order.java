package test;

/**
 * ASUMSI / BELUM DIKONFIRMASI KE README ASLI.
 * Cocokkan lagi field, kapasitas, & method di bawah dengan spesifikasi asli begitu ada.
 *
 * A customer's order: holds up to 20 {@link OrderItem} objects.
 *
 * This is an AGGREGATION (same pattern as Menu holding MenuItem):
 * the OrderItem objects are created outside and passed in.
 */
public class Order {

    private Customer customer;
    private OrderItem[] items;
    private int itemCount;

    /**
     * Creates an empty order for the given customer: initialize the
     * array with capacity 20 and the counter with 0.
     *
     * @param customer the customer placing this order
     */
    public Order(Customer customer) {
        this.customer = customer;
        this.items = new OrderItem[20];
        this.itemCount = 0;
    }

    public Customer getCustomer() {
        return customer;
    }

    /**
     * Adds an item at index {@code itemCount}, then increments the counter.
     * When the order is full (20 items), do nothing.
     *
     * @param item the order item to add
     */
    public void addOrderItem(OrderItem item) {
        if (itemCount >= items.length) {
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public int getItemCount() {
        return itemCount;
    }

    /**
     * Sum of every line item's subtotal in this order.
     *
     * @return total price in Rupiah
     */
    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getSubtotal();
        }
        return total;
    }
}
