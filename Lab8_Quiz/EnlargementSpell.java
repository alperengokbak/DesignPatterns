package Lab8_Quiz;

public class EnlargementSpell implements Command{
    Target target;
    @Override
    public void execute(Target target) {
        this.target = target;
        if(target.getSize() == Size.LARGE) {
            System.out.println("Can't get enlarge anymore!");
        } else if(target.getSize() == Size.NORMAL) {
            target.setSize(Size.LARGE);
        } else if(target.getSize() == Size.SMALL) {
            target.setSize(Size.NORMAL);
        }
    }

    @Override
    public void undo() {
        ShrinkSpell shrinkSpell = new ShrinkSpell();
        shrinkSpell.execute(target);
    }
    
}
