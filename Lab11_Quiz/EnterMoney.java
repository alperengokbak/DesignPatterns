package Lab11_Quiz;

public class EnterMoney implements State {
    VendingMachine vendingMachine;

    public EnterMoney(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Enter The Money: ");
        vendingMachine.setState(vendingMachine.enterChoice);
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
        // TODO Auto-generated method stub

    }

}
