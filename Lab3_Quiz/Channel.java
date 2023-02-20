package Lab3_Quiz;

import java.util.ArrayList;

public class Channel implements IChannel{

    ArrayList<IPerson> channel = new ArrayList<>();

    @Override
    public void addPerson(IPerson observer) {
        channel.add(observer);
    }

    @Override
    public void deletePerson(IPerson observer) {
        channel.remove(observer);
    }

    @Override
    public void notifyPerson() {
        for (IPerson object : channel) {
            object.update();
        }
    }
}
