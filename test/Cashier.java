package test;

/**
 * ASUMSI / BELUM DIKONFIRMASI KE README ASLI.
 * Cocokkan lagi field & method di bawah dengan spesifikasi asli begitu ada.
 *
 * The cashier who processes payment for an Order.
 */
public class Cashier {

    private String cashierName;

    /**
     * Creates a cashier and stores the parameter into the field.
     *
     * @param cashierName the cashier's name
     */
    public Cashier(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getCashierName() {
        return cashierName;
    }

    /**
     * Processes payment for an order.
     *
     * Rule: if amountPaid is less than the order's total price, the
     * payment is invalid — do nothing and return -1 as a failure signal.
     * Otherwise, return the change (amountPaid - total).
     *
     * @param order      the order being paid for
     * @param amountPaid how much cash the customer handed over
     * @return the change, or -1 if amountPaid is insufficient
     */
    public double processPayment(Order order, double amountPaid) {
        double total = order.getTotalPrice();
        if (amountPaid < total) {
            return -1;
        }
        return amountPaid - total;
    }
}
