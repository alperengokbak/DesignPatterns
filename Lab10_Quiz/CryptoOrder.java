package Lab10_Quiz;

public class CryptoOrder extends OrderProcessTemplate {

    public CryptoOrder(String paymentType) {
        super(paymentType);
    }

    @Override
    void handlePayment() {
        if (paymentType.equals("digital")) {
            System.out.println("---- Handling payment for ordering by digital currency.");
        } else {
            System.out.println("There is not choice.");
        }

    }

    @Override
    void handleDelivered() {
        System.out.println("It will take some time to deliver the physical items to your address.");

    }

}
