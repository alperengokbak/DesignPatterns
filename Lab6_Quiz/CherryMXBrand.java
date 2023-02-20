package Lab6_Quiz;

public class CherryMXBrand extends SwitchMaker{
    SwitchComponentCherryFactory switchComponentCherryFactory;

    @Override
    Switch createSwitch(String type) {
        SwitchComponentCherryFactory switchComponentCherryFactory = new SwitchComponentCherryFactory();
        switchComponentCherryFactory.createStem();
        switchComponentCherryFactory.createKeyCap();
        switchComponentCherryFactory.createCoilSpring(null);
        return null;
    }

    @Override
    Switch assembleSwitch(String type) {
        return null;
    }

}
