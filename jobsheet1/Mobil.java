public class Mobil extends Kendaraan {
    private String tipe;
    private int kecepatanMax;

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setKecepatanMax(int kecepatanMax) {
        this.kecepatanMax = kecepatanMax;
    }

    public void printInfo() {
        System.out.println("=== INFORMASI MOBIL ===");
        System.out.println("Tipe: " + tipe);
        System.out.println("Kecepatan Maksimal: " + kecepatanMax + " km/jam");

        super.printInfo();
    }
}