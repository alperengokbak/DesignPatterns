package Lab8_Quiz;

public class Wizard {
    Command command;
    void execute (Target target, Command command) {
        this.command = command;
        command.execute(target);
    }
    void undo (Target target) {
        command.undo();
    }
}
