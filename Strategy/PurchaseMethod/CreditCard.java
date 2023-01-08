package Strategy.PurchaseMethod;

public class CreditCard {
    private int amount;
    private String number, date, verificationValue;

    public CreditCard (String number, String date, String verificationValue) {
        this.number = number;
        this.date = date;
        this.verificationValue = verificationValue;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }
}
