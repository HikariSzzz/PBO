public class MotorSupra extends motor {
    String jenisMesin;
    int tahunProduksi;

    void jalan() {
        System.out.println("Motor Supra sedang berjalan.");
    }

    void servis() {
        System.out.println("Motor Supra sedang diservis.");
    }

    void cetakInformasi() {
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Jenis Mesin: " + jenisMesin);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}