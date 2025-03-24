// Kelas utama untuk menjalankan program
public class App {
    public static void main(String[] args) {
        // Membuat objek smartphone umum
        Smartphone umum = new Smartphone("Nokia", 2000000);
        umum.tampilkanSpesifikasi();

        // Membuat objek Android
        Android samsung = new Android("Samsung Galaxy S23", 15000000);
        samsung.tampilkanSpesifikasi(); // Overriding

        // Membuat objek iPhone
        Iphone Iphone = new Iphone("iPhone 15", 20000000);
        Iphone.tampilkanSpesifikasi(); // Overriding

        // Demonstrasi Overloading
        samsung.ubahHarga(14000000);
        samsung.ubahHarga(13500000, true);

        Iphone.ubahHarga(19000000);
        Iphone.ubahHarga(18500000, false);
    }
}
