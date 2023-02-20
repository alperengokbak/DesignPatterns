package Lab6_Quiz;

public class Tactile extends Switch{
    SwitchComponentFactory switchComponentFactory;

    @Override
    void gatherParts() {
        this.coilSpring = switchComponentFactory.createCoilSpring(PressureCN.Medium);
        this.keyCap = switchComponentFactory.createKeyCap();
        this.stem = switchComponentFactory.createStem();
    }
    
}
