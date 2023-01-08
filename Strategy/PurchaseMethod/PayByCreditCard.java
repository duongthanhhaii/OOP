package Strategy.PurchaseMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;


    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card");
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the card number: ");
            String number = reader.readLine();
            System.out.println("Enter the card expiration date: ");
            String date = reader.readLine();
            System.out.println("Enter the card VerificationValue code: ");
            String verificationValue = reader.readLine();

            if (CreditCardValidator.isValid(Long.parseLong(number))) {
                card = new CreditCard(number,date,verificationValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }


}
