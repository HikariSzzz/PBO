package test;

/**
 * A cafe customer.
 */
public class Customer {

    private String customerId;
    private String name;

    /**
     * Creates a customer and stores both parameters into the fields.
     *
     * @param customerId customer identifier
     * @param name       customer's name
     */
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    /**
     * Updates the name. A null or blank name is invalid:
     * ignore it and leave the field unchanged.
     *
     * @param name new name
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return;
        }
        this.name = name;
    }
}
