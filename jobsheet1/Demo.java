public class Demo {
    public static void main(String[] args) {

        Kendaraan kendaraan = new Kendaraan();
        Motor motor = new Motor();
        Mobil mobil = new Mobil();
        Laptop laptop = new Laptop();
        Smartphone smartphone = new Smartphone();

        kendaraan.setJenis("Motor");
        kendaraan.setWarna("Hitam");
        kendaraan.setTahunRilis(2024);
        kendaraan.printInfo();
        System.out.println();

        motor.setJenis("Motor");
        motor.setWarna("Putih");
        motor.setTahunRilis(2024);
        motor.setTipe("Scoopy");
        motor.setKecepatanMax(100);
        motor.printInfo();
        System.out.println();

        mobil.setJenis("Mobil");
        mobil.setWarna("putih");
        mobil.setTahunRilis(2016);
        mobil.setTipe("Agia");
        mobil.setKecepatanMax(200);
        mobil.printInfo();
        System.out.println();

        laptop.setBrand("ASUS");
        laptop.setSpek("Daily");
        laptop.printInfo();
        System.out.println();

        smartphone.setBrand("Infinix Note 40");
        smartphone.setSpek("Daily");
        smartphone.printInfo();
    }
}