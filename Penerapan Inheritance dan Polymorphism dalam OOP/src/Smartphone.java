// Superclass: Smartphone
public class Smartphone {
    protected String merek;
    protected double harga;

    // Constructor
    public Smartphone(String merek, double harga) {
        this.merek = merek;
        this.harga = harga;
    }

    // Metode yang akan dioverride
    public void tampilkanSpesifikasi() {
        System.out.println("Smartphone " + merek + " dengan harga Rp" + harga);
    }

    // Overloading metode ubahHarga
    public void ubahHarga(double harga) {
        this.harga = harga;
        System.out.println("Harga " + merek + " diperbarui menjadi Rp" + harga);
    }

    public void ubahHarga(double harga, boolean garansi) {
        this.harga = harga;
        if (garansi) {
            System.out.println("Harga " + merek + " diperbarui menjadi Rp" + harga + " dengan garansi resmi.");
        } else {
            System.out.println("Harga " + merek + " diperbarui menjadi Rp" + harga + " tanpa garansi.");
        }
    }
}
