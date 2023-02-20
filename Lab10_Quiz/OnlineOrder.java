package Lab10_Quiz;

public class OnlineOrder extends OrderProcessTemplate {

    public OnlineOrder(String paymentType) {
        super(paymentType);
    }

    @Override
    void handlePayment() {
        if (paymentType.equals("debit") || paymentType.equals("credit")) {
            System.out.println("Handling payment for online order.");
        } else {
            System.out.println("There is not choice for that.");
        }
    }

    @Override
    void handleDelivered() {
        System.out.println("---- Handling delivering for online order");
        System.out.println("We are shipping your items to your address.");
    }

}
