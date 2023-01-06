import java.util.Random;

public class magic implements IHeroAttackType{
    @Override
    public void attack(Hero target) {
        Random random = new Random();
        if(0.2 <= random.nextDouble()){
            target.setHP(target.getHP() - 40);
        }else{
            target.setHP(target.getHP());
        }
    }
}
