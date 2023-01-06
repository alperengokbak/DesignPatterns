public class Ranger extends Hero{

    public Ranger(String name) {
        super(new ranged());
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
