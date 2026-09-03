public class Kendaraan {
    private String jenis;
    private String warna;
    private int tahunRilis;

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public void printInfo() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Rilis: " + tahunRilis);
    }
}