public class Payment {
    private String customerId;
    private String paymentId;
    private String paymentDate;
    private double amount;

    public Payment () {
        this.paymentId = generateID();
        this.paymentDate = generateDate();
    }

    public Payment (String customerId) {
        this.customerId = customerId;
        this.paymentId = generateID();
        this.paymentDate = generateDate();

    }

    public Payment (String customerId, double amount) {
        this.customerId = customerId;
        this.amount = amount;
        this.paymentId = generateID();
        this.paymentDate = generateDate();
    }

    public Payment(String customerId, double amount, String paymentId) {
        this.customerId = customerId;
        this.amount = amount;
        this.paymentId = paymentId;
        this.paymentDate = generateDate();
    }

    public String generateID() {
        //we can get from latest id from database, or generate uuid
        return "1111111";
    }

    public String generateDate() {
        //current date timestamp
        return "2025-03-06";
    }

    public void pay(double amount) {
        System.out.println("Transferring " + amount + " to the account.");
    }

    public void printPaymentDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Amount: " + amount);
        System.out.println("Customer ID: " + customerId);
    }

}
