package Lab10_Quiz;

public abstract class OrderProcessTemplate {
    String paymentType;

    public OrderProcessTemplate(String paymentType) {
        this.paymentType = paymentType;
    }

    abstract void handlePayment();

    abstract void handleDelivered();

    final void processOrder(int item) {
        System.out.println("---- Selecting items online.");
        handlePayment();
        handleDelivered();
        System.out.println("Your order of " + item + " has been processed.");
    }
}
