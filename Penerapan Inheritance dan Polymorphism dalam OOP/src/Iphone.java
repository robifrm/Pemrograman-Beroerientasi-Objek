// Subclass: iPhone (mewarisi Smartphone)
public class Iphone extends Smartphone {
    public Iphone(String merek, double harga) {
        super(merek, harga);
    }

    // Override metode tampilkanSpesifikasi
    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Smartphone iPhone " + merek + " dengan harga Rp" + harga );
    }
}
