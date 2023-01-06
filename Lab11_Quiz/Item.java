package Lab11_Quiz;

public class Item {
    String name;
    int stock;
    int cost;

    public Item(String name, int stock, int cost) {
        this.name = name;
        this.stock = stock;
        this.cost = cost;
    }

    public void add(Item item) {
        item.add(item);
    }
}
