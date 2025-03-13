// Subclass untuk pembayaran melalui transfer bank
public class PaymentBankTransfer extends Payment {
    private String bankAccountNumber;
    private String bankName;

    public PaymentBankTransfer(String customerId, double amount, String bankAccountNumber, String bankName) {
        super(customerId, amount);
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
    }

    public void pay(double amount) {
        System.out.println("Memproses transfer bank sebesar " + amount + " ke nomor rekening " + bankAccountNumber + " di bank " + bankName);
        // Implementasi proses transfer bank
    }

    public void printPaymentDetails() {
        super.printPaymentDetails();
        System.out.println("Nomor Rekening Bank: " + bankAccountNumber);
        System.out.println("Nama Bank: " + bankName);
    }
}

