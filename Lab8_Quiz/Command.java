package Lab8_Quiz;

public interface Command {

    public abstract void execute(Target target);
    public abstract void undo();
    
}
