package Lab6_Quiz;

public class Linear extends Switch{
    SwitchComponentFactory switchComponentFactory;
    @Override
    void gatherParts() {
        this.coilSpring = switchComponentFactory.createCoilSpring(PressureCN.Light);
        this.keyCap = switchComponentFactory.createKeyCap();
        this.stem = switchComponentFactory.createStem();
    }
    
}
