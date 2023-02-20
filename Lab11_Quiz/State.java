package Lab11_Quiz;

public interface State {
    void insertMoney();

    void enterChoice();

    void noCandy();

    void dispense(Item item);
}
