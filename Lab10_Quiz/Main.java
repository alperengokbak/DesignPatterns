package Lab10_Quiz;

public class Main {
    public static void main(String[] args) {
        OrderProcessTemplate onlineOrder = new OnlineOrder("debit");
        OrderProcessTemplate cryptoOrder = new CryptoOrder("digital");
        OrderProcessTemplate inStore = new InStoreOrder("cash");

        Customer customer = new Customer("Jack", 3008);
        customer.add2(onlineOrder);
        customer.add2(cryptoOrder);
        customer.add2(inStore);

        customer.print();
    }
}
