// Subclass: Android (mewarisi Smartphone)
public class Android extends Smartphone {
    public Android(String merek, double harga) {
        super(merek, harga);
    }

    // Override metode tampilkanSpesifikasi
    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Smartphone Android " + merek + " dengan harga Rp" + harga);
    }
}
