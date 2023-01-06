package Lab11_Quiz;

public class NoCandy implements State {
    VendingMachine vendingMachine;

    public NoCandy(VendingMachine vendingMachine) {
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
        System.out.println("Not enough money!!");

    }

    @Override
    public void dispense(Item item) {
        // TODO Auto-generated method stub

    }

}
