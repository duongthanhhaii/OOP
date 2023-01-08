package Strategy.PurchaseMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPaypal implements PayStrategy{
    private static final Map<String, String> data = new HashMap<>();
    private String email, password;
    private boolean signedIn;
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        data.put("amanda1985", "amanda*ya.com");
        data.put("qwerty", "john@amazon.eu");
    }


    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paying" + paymentAmount + "using PayPal");
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println("Enter the email");
                email = reader.readLine();
                System.out.println("Enter password");
                password = reader.readLine();

                if (verify()) {
                    System.out.println("Successful");
                } else {
                    System.out.println("Wrong email or password");
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    private boolean verify(){
        setSignedIn(email.equals(data.get(password)));
        return signedIn;
     }


}
