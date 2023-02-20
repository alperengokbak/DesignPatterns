package Lab8_Quiz;

public class VisibilitySpell implements Command{
    Target target;

    @Override
    public void execute(Target target) {
        this.target = target;
        target.setVisibility(Visibility.INVISIBLE);
    }

    @Override
    public void undo() {
        InvisibilitySpell invisibilitySpell = new InvisibilitySpell();
        invisibilitySpell.execute(target);
    }
}
