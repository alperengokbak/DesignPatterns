package Lab11_Quiz;

public class VendingMachine {
    State insertMoney;
    State enterChoice;
    State dispense;
    State noCandy;
    int money;

    State state;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public VendingMachine() {
        insertMoney = new EnterMoney(this);
        enterChoice = new EnterChoice(this);
        dispense = new Dispense(this);
        noCandy = new NoCandy(this);

        state = insertMoney;
    }

    public void insertMoney() {
        state.insertMoney();
    }

    public void enterChoice() {
        state.enterChoice();
    }

    public void dispense(Item item) {
        state.dispense(item);
        setMoney(money);
    }

    public void noCandy() {
        state.noCandy();
    }

    void setState(State state) {
        this.state = state;
    }
}
