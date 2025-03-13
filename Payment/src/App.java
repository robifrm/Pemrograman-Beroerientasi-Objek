public class App {
    public static void main(String[] args) throws Exception {
     
        PaymentPaypal payX = new PaymentPaypal("1234567890", "1234567890", "1234567890");

        Payment payY = new PaymentPaypal("1234567890", "1234567890", "1234567890");

        Payment payZ = new Payment("1234567890");

        PaymentBankTransfer payB = new PaymentBankTransfer("1234567890", 10000, "0987654321", "Bank CBA");

        payX.pay(10000);
        payY.pay(10000);
        payZ.pay(10000);
        payB.pay(10000);

    }
}
