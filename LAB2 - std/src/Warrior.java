public class Warrior extends Hero{
    
    public Warrior(String name) {
        super(new melee());
        setHeroName(name);
    }

    @Override
    public void display() {
        System.out.println("Hero Name: " + this.getHeroName());
        System.out.println("Hero Class: " + this.getClass());
        System.out.println("Attack Type: " + this.getHeroAttackType());
        System.out.println("Hero HP: " + this.getHP());
    }
}
