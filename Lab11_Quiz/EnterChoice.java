package Lab11_Quiz;

public class EnterChoice implements State {
    VendingMachine vendingMachine;

    public EnterChoice(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterChoice() {
        System.out.println("Enter Choice: \n");
        vendingMachine.setState(vendingMachine.dispense);
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
