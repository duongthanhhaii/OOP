package Strategy.PurchaseMethod;

public interface PayStrategy {
    boolean pay (int paymentAmount);
    void collectPaymentDetails();
}
