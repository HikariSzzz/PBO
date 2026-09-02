public class motorGP extends motor {
    String tim;
    int nomorPembalap;

    void balapan() {
        System.out.println("Motor GP sedang balapan.");
    }

    void ubahMode() {
        System.out.println("Mode balap diaktifkan.");
    }

    void cetakInformasi() {
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Tim: " + tim);
        System.out.println("Nomor Pembalap: " + nomorPembalap);
    }
}