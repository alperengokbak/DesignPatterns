package Lab6_Quiz;

public class GateronBrand extends SwitchMaker{

    @Override
    Switch createSwitch(String type) {
        SwitchComponentFactory switchComponentFactory = new SwitchComponenetGateronFactory();
        switchComponentFactory.createCoilSpring(null);
        switchComponentFactory.createKeyCap();
        switchComponentFactory.createStem();
        return null;
    }

    @Override
    Switch assembleSwitch(String type) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
