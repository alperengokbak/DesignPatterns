public class melee implements IHeroAttackType{
    @Override
    public void attack(Hero target) {
        target.setHP(target.getHP() - 30);
    }
    
}
