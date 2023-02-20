public class Mage extends Hero{

    public Mage(String name) {
        super(new magic());
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
