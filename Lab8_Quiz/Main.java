package Lab8_Quiz;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Target goblin = new Goblin(Size.NORMAL, Visibility.VISIBLE);

        Command shrinkSpell = new ShrinkSpell();
        Command enlargeSpell = new EnlargementSpell();
        wizard.execute(goblin, shrinkSpell);
        System.out.println(goblin);
        wizard.execute(goblin, enlargeSpell);
        System.out.println(goblin);
        wizard.undo(goblin);
        System.out.println(goblin);
    }
}
