package Lab10_Quiz;

import java.util.ArrayList;

public class Customer {

    String name;
    ArrayList<OrderProcessTemplate> list = new ArrayList<>();
    double cardLimit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(double cardLimit) {
        this.cardLimit = cardLimit;
    }

    public Customer(String name, double cardLimit) {
        this.name = name;
        this.cardLimit = cardLimit;
    }

    public void add2(OrderProcessTemplate type) {
        list.add(type);
    }

    void print() {
        for (OrderProcessTemplate obj : list) {
            obj.processOrder(0);
        }
    }

}
