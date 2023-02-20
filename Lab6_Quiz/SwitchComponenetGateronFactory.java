package Lab6_Quiz;

public class SwitchComponenetGateronFactory implements SwitchComponentFactory{

    @Override
    public KeyCap createKeyCap() {
        return new GateronKeyCap();
    }

    @Override
    public Stem createStem() {
        return new GateronStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        int value = pressureCN.ordinal();
        if (value == 45) {
            return new CherryMXCoilSpring(value);
        } else if (value == 55) {
            return new CherryMXCoilSpring(value);
        } else if (value == 60) {
            return new CherryMXCoilSpring(value);
        } else if (value == 80) {
            return new CherryMXCoilSpring(value);
        }
        return null;
    }
    
}
