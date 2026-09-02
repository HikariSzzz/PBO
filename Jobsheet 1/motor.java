public class motor {
    String warna;
    int kecepatan;

    void nyalakan() {
        System.out.println("Motor dinyalakan.");
    }

    void berhenti() {
        System.out.println("Motor berhenti.");
    }

    void cetakInformasi() {
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}
