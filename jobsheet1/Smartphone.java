public class Smartphone {
    private String brand;
    private String spek;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpek(String spek) {
        this.spek = spek;
    }

    public void printInfo() {
        System.out.println("=== INFORMASI SMARTPHONE ===");
        System.out.println("Brand: " + brand);
        System.out.println("Spek: " + spek);
    }
}