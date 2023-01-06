package Lab6_Quiz;

public class Clicky extends Switch{
    SwitchComponentFactory switchComponentFactory;

    @Override
    void gatherParts() {
        this.coilSpring = switchComponentFactory.createCoilSpring(PressureCN.Heavy);
        this.keyCap = switchComponentFactory.createKeyCap();
        this.stem = switchComponentFactory.createStem();
    }
    
}
