package Lab11_Quiz;

import java.util.Scanner;

public class Dispense implements State {
    VendingMachine vendingMachine;

    public Dispense(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterChoice() {
        // TODO Auto-generated method stub

    }

    @Override
    public void noCandy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void dispense(Item item) {
        if (vendingMachine.money >= item.cost) {
            System.out.println("Preparing o dispense... \n");
            System.out.println("The ite is dispensed. Please collect it \n");
            System.out.println("Dou you have anything ? \n");

            Scanner scanner = new Scanner(System.in);
            String decision = scanner.next();

            if (decision.equals("Yes")) {
                vendingMachine.setState(vendingMachine.enterChoice);
            } else {
                vendingMachine.setState(vendingMachine.noCandy);
            }
            scanner.close();
        } else if (item.stock <= 0) {
            System.out.println("There is no more " + item.name);
        } else {
            vendingMachine.setState(vendingMachine.noCandy);
        }

    }

}
