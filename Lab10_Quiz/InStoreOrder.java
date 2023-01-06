package Lab10_Quiz;

public class InStoreOrder extends OrderProcessTemplate {

    public InStoreOrder(String paymentType) {
        super(paymentType);
    }

    @Override
    void handlePayment() {
        if (paymentType.equals("debit") || paymentType.equals("credit") || paymentType.equals("cash")) {
            System.out.println("---- Handling payment for in store order.");
            System.out.println("---- Handling delivery for customer.");
        } else {
            System.out.println("There is not choice for that.");
        }

    }

    @Override
    void handleDelivered() {
        System.out.println("Please fill out this form with your address.");
    }

}
