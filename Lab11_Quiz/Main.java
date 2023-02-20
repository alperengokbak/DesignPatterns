package Lab11_Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<Item>();
        VendingMachine vendingMachine = new VendingMachine();
        Item item = new Item("Haribo", 5, 20);
        Item item2 = new Item("Snicker", 10, 35);
        items.add(item);
        items.add(item2);
        int money;
        vendingMachine.insertMoney();
        money = scanner.nextInt();
        vendingMachine.enterChoice();
        String choice = scanner.next();
        vendingMachine.dispense(item);
        scanner.close();
    }
}
