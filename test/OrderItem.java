package test;

/**
 * ASUMSI / BELUM DIKONFIRMASI KE README ASLI.
 * Cocokkan lagi field & method di bawah dengan spesifikasi asli begitu ada.
 *
 * One line item within an Order: a MenuItem plus how many were ordered.
 * This is an ASSOCIATION to MenuItem (holds a reference to it, does not own it).
 */
public class OrderItem {

    private MenuItem menuItem;
    private int quantity;

    /**
     * Creates an order item and stores both parameters into the fields.
     *
     * @param menuItem the menu item being ordered
     * @param quantity how many units of that menu item
     */
    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Subtotal for this line = menuItem's price * quantity.
     *
     * @return subtotal in Rupiah
     */
    public double getSubtotal() {
        return menuItem.getPrice() * quantity;
    }
}
