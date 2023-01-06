package Lab8_Quiz;

public class ShrinkSpell implements Command{
    Target target;
    @Override
    public void execute(Target target) {
        this.target = target;
        if(target.getSize() == Size.LARGE) {
            target.setSize(Size.NORMAL);
        } else if(target.getSize() == Size.NORMAL) {
            target.setSize(Size.SMALL);
        } else if(target.getSize() == Size.SMALL) {
            System.out.println("Can't get smaller anymore!");
        }
    }

    @Override
    public void undo() {
        EnlargementSpell enlargementSpell = new EnlargementSpell();
        enlargementSpell.execute(target);
    }
}
