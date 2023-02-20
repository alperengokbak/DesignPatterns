package Lab8_Quiz;

public class InvisibilitySpell implements Command{
    Target target;

    @Override
    public void execute(Target target) {
        this.target = target;
        target.setVisibility(Visibility.VISIBLE);
    }

    @Override
    public void undo() {
        VisibilitySpell visibilitySpell = new VisibilitySpell();
        visibilitySpell.execute(target);
    }
    
}
